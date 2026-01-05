//234. Palindrome Linked List
package DSA.Leetcode;

public class Palindrome_LinkedList {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int new_data) {
            data = new_data;
            next = null;
        }
    }

    public static ListNode findmiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean ispalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode middle = findmiddle(head);
        ListNode secondhalfstart = reverse(middle.next);

        ListNode firststart = head;
        ListNode copySecondHalf = secondhalfstart; // Save for restoring

        boolean result = true;
        while (secondhalfstart != null) {
            if (firststart.data != secondhalfstart.data) {
                result = false;
                break;
            }
            firststart = firststart.next;
            secondhalfstart = secondhalfstart.next;
        }

        // Restore
        middle.next = reverse(copySecondHalf);

        return result;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(ispalindrome(head)); // true
        printList(head); // 1 2 2 1
    }
}
