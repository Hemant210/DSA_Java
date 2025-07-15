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

// class Node {
//     int data;
//     Node next;

//     Node(int new_data) {
//         data = new_data;
//         next = null;
//     }
// }

// public class Linklist_practice {

//     // public static Node reverseList(Node head) {
//     //     Node curr = head, prev = null, next;

//     //     while (curr != null) {
//     //         next = curr.next;
//     //         curr.next = prev;
//     //         prev = curr;
//     //         curr = next;
//     //     }
//     //     return prev;
//     // }

//     public static Node reverList(Node head){
//         if (head == null || head.next == null) {
//             return head;
//         }

//         Node rest = reverList(head.next);
//         head.next.next = head;
//         head.next = null;

//         return rest;
//     }

//     public static void printList(Node node) {
//         while (node != null) {
//             System.out.println(node.data);
//             node = node.next;
//         }
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);

//         System.out.print("Given Linked list:");
//         printList(head);

//         head = reverList(head);

//         System.out.print("\nReversed Linked List:");
//         printList(head);
//     }
// }

// Java program to delete a linked list node at a given
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class Linklist_practice {
//     // Function to delete a node at a given position
//     public static Node deleteNode(Node head, int position) {
//         Node temp = head;
//         Node prev = null;

//         // Base case if linked list is empty
//         if (temp == null)
//             return head;

//         // Case 1: Head is to be deleted
//         if (position == 1) {
//             head = temp.next;
//             return head;
//         }

//         // Case 2: Node to be deleted is in middle
//         // Traverse till given position
//         for (int i = 1; temp != null && i < position; i++) {
//             prev = temp;
//             temp = temp.next;
//         }

//         // If given position is found, delete node
//         if (temp != null) {
//             prev.next = temp.next;
//         } else {
//             System.out.println("Data not present");
//         }

//         return head;
//     }

//     // Function to print the linked list
//     public static void printList(Node head) {
//         while (head != null) {
//             System.out.print(head.data + " -> ");
//             head = head.next;
//         }
//         System.out.println("null");
//     }

//     // Driver code
//     public static void main(String[] args) {
//         // Creating a static linked list
//         // 1 -> 2 -> 3 -> 4 -> 5 -> null
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);

//         // Print original list
//         System.out.print("Original list: ");
//         printList(head);

//         // Deleting node at position 2
//         int position = 2;
//         head = deleteNode(head, position);

//         // Print list after deletion
//         System.out.print("List after deletion: ");
//         printList(head);
//     }
// }

//Insert Node at the End of a Linked List
class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class Linklist_practice {   
    // Given the head of a list and an int, appends
    // a new node at the end and returns the head.
    public static Node append(Node head, int newData) {
      
        // Create a new node
        Node newNode = new Node(newData);

        // If the Linked List is empty, make the new 
        // node as the head and return
        if (head == null) {
            return newNode;
        }

        // Store the head reference in a temporary variable
        Node last = head;

        // Traverse till the last node
        while (last.next != null) {
            last = last.next;
        }

        // Change the next pointer of the 
        // last node to point to the new node
        last.next = newNode;

        // Return the head of the list
        return head;
    }

    // This function prints the contents of 
    // the linked list starting from the head
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    // Driver code
    public static void main(String[] args) {
        // 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        System.out.print("Created Linked list is:");
        printList(head);

        head = append(head, 1);

        System.out.print("\nAfter inserting 1 at the end:");
        printList(head);
    }
}