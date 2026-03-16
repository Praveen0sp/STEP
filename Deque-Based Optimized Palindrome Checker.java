import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {

    public static void main(String[] args) {
        String original = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
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
