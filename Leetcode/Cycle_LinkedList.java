package Leetcode;

public class Cycle_LinkedList {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int new_data) {
            data = new_data;
            next = null;
        }
    }
    

    public static boolean isCycle(ListNode head){
        if (head == null) {
            return false;
        }

        ListNode h = head;
        ListNode t = head;

        while (h != null && h.next != null) {
            h = h.next.next;
            t = t.next;

            if (h == t) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        head.next.next.next.next = head.next;

        System.out.println(isCycle(head));
    }
}
