// Define the common interface
interface PalindromeStrategy {
    boolean isValid(String input);
}

// Strategy 1: Using a Stack (LIFO)
class StackStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (char c : clean.toCharArray()) stack.push(c);
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        
        return clean.equals(reversed.toString());
    }
}

// Strategy 2: Using Two-Pointer (Optimized)
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }
}

// The Context class that uses the strategy
class PalindromeChecker {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void verify(String text) {
        System.out.println("Using " + strategy.getClass().getSimpleName() + ": " + strategy.isValid(text));
    }
}

public class StrategyApp {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String text = "Level";

        checker.setStrategy(new StackStrategy());
        checker.verify(text);

        checker.setStrategy(new TwoPointerStrategy());
        checker.verify(text);
    }
}
