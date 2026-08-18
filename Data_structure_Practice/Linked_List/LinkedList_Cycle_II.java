package Data_structure_Practice.Linked_List;

public class LinkedList_Cycle_II {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode Is_Cycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean iscycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                iscycle = true;
                break;
            }
        }

        if (!iscycle) {
            return null;
        }

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // pos = 1 means last node (-4) points back to node at index 1 (value 2)
        head.next.next.next.next = head.next;

        System.err.println(Is_Cycle(head));
    }
}