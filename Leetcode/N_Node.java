package Leetcode;

//19. Remove Nth Node From End of List
public class N_Node {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int new_data) {
            data = new_data;
            next = null;
        }
    }

    // Print data
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        // Size
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        System.out.print("Original List: ");
        printList(head);

        head = removeNthFromEnd(head, 2);
        System.out.print("Updates List : ");
        printList(head);
    }
    
}
