public class PalindromeBenchmark {

    public static void main(String[] args) {
        String testString = "A man a plan a canal Panama".repeat(100); 
        long startStack = System.nanoTime();
        checkStack(testString);
        long endStack = System.nanoTime();
        System.out.println("Stack Approach: " + (endStack - startStack) + " ns");

        long startPointer = System.nanoTime();
        checkTwoPointer(testString);
        long endPointer = System.nanoTime();
        System.out.println("Two-Pointer Approach: " + (endPointer - startPointer) + " ns");
    }

    public static boolean checkStack(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    public static boolean checkTwoPointer(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
