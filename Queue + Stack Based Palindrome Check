import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {
        String original = "madam";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word '" + original + "' is a palindrome.");
        } else {
            System.out.println("The word '" + original + "' is NOT a palindrome.");
        }
    }
}
