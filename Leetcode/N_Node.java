package Leetcode;

//19. Remove Nth Node From End of List
// public class N_Node {
//     static class ListNode {
//         int data;
//         ListNode next;

//         ListNode(int new_data) {
//             data = new_data;
//             next = null;
//         }
//     }

//     // Print data
//     public static void printList(ListNode node) {
//         while (node != null) {
//             System.out.println(node.data);
//             node = node.next;
//         }
//         System.out.println();
//     }

//     public static ListNode removeNthFromEnd(ListNode head, int n) {
//         if (head == null) {
//             return head;
//         }

//         // Size
//         int size = 0;
//         ListNode curr = head;
//         while (curr != null) {
//             curr = curr.next;
//             size++;
//         }

//         if (n == size) {
//             return head.next;
//         }

//         int indexSearch = size - n;
//         ListNode prev = head;
//         int i = 1;
//         while (i < indexSearch) {
//             prev = prev.next;
//             i++;
//         }

//         prev.next = prev.next.next;
//         return head;
//     }

//     public static void main(String[] args) {
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(1);
//         head.next.next = new ListNode(2);
//         head.next.next.next = new ListNode(3);
//         head.next.next.next.next = new ListNode(4);
//         head.next.next.next.next.next = new ListNode(5);
//         System.out.print("Original List: ");
//         printList(head);

//         head = removeNthFromEnd(head, 2);
//         System.out.print("Updates List : ");
//         printList(head);
//     }

// }

public class N_Node {
    // Link list node
    static class Node {
        int data;
        Node next;

        // Constructor to initialize a new node with data
        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    // Function to find Nth node from the end of linked list
    public static int nthFromEnd(Node head, int N) {

        // Create two pointers main_ptr and ref_ptr
        // initially pointing to head.
        Node main_ptr = head;
        Node ref_ptr = head;

        // Move ref_ptr to the N-th node from beginning.
        for (int i = 1; i < N; i++) {
            ref_ptr = ref_ptr.next;

            // If the ref_ptr reaches NULL, then it means
            // N > length of linked list
            if (ref_ptr == null) {
                return -1;
            }
        }

        // Move ref_ptr and main_ptr by one node until
        // ref_ptr reaches last node of the list.
        while (ref_ptr.next != null) {
            ref_ptr = ref_ptr.next;
            main_ptr = main_ptr.next;
        }

        return main_ptr.data;
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 35 -> 15 -> 4 -> 20
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        // Function Call to find the 4th node from end
        System.out.println(nthFromEnd(head, 4));
    }
}
