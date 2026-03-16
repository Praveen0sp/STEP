public class PalindromeChecker {

    public static void main(String[] args) {
        String original = "A man a plan a canal Panama";
        
        // Step 1: Normalize (Lowercase + Remove non-alphanumeric)
        String cleanString = original.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Step 2: Comparison (using Two-Pointer for efficiency)
        boolean isPalindrome = true;
        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Result: '" + original + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + original + "' is NOT a palindrome.");
        }
    }
}
