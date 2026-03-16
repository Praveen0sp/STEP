class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "madam";
        Node head = new Node(original.charAt(0));
        Node temp = head;
        for (int i = 1; i < original.length(); i++) {
            temp.next = new Node(original.charAt(i));
            temp = temp.next;
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null, current = slow;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        Node firstHalf = head, secondHalf = prev;
        boolean isPalindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        if (isPalindrome) {
            System.out.println("The word '" + original + "' is a palindrome.");
        } else {
            System.out.println("The word '" + original + "' is NOT a palindrome.");
        }
    }
}
