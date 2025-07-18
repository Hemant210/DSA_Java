package Leetcode;

//1721. Swapping Nodes in a Linked List
public class Swapping_Nodes {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode second = head;
        ListNode front = head;

        // Move to the kth node from beginning
        for (int i = 1; i < k; i++) {
            front = front.next;
        }

         // Store reference to kth node from start
          ListNode kthFromStart = front;

        // Move front to the end, move second from beginning
        while (front.next != null) {
            front = front.next;
            second = second.next;
        }

        // Swap values
        int temp = kthFromStart.val;
        kthFromStart.val = second.val;
        second.val = temp;

        return head;
    }

    // Print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        // Example: [1,2,3,4,5], k = 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        printList(head);

        int k = 2;
        head = swapNodes(head, k);

        System.out.print("After swapping kth node: ");
        printList(head);
    }
}
