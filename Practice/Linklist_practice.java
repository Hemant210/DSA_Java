package Practice;

// public class Linklist_practice {
//     Node head;

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Add at beginning
//     public void add(String data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     // Add at end
//     public void add_last(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node currNode = head;
//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }

//     public void reversseIterate() {
//         if (head == null || head.next == null) {
//             return;
//         }

//         Node prevNode = head;
//         Node currNode = head.next;
//         while (currNode != null) {
//             Node nextNode = currNode.next;
//             currNode.next = prevNode;

//             prevNode = currNode;
//             currNode = nextNode;
//         }

//         head.next = null;
//         head = prevNode;
//     }

//     public Node reverseRecursive(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         Node newHead = reverseRecursive(head.next);
//         head.next.next = head;
//         head.next = null;

//         return newHead;
//     }

//     public void printList() {
//         Node currNode = head;
//         while (currNode != null) {
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }

//     public static void main(String[] args) {
//         Linklist_practice list = new Linklist_practice();
//         list.add_last("0");
//         list.add_last("2");
//         list.add_last("4");
//         list.add_last("5");

//         System.out.println("Original list:");
//         list.printList();

//         // list.reversseIterate();s
//         list.head = list.reverseRecursive(list.head);
//         System.out.println("Reversed list:");
//         list.printList();
//     }
// }

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}


public class Linklist_practice {

    // public static Node reverseList(Node head) {
    //     Node curr = head, prev = null, next;

    //     while (curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }

    public static Node reverList(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node rest = reverList(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked list:");
        printList(head);
        
        head = reverList(head);

        System.out.print("\nReversed Linked List:");
        printList(head);
    }
}