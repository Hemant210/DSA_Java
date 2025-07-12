package Practice;

public class Linklist_practice {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add at beginning
    public void add(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void add_last(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void reversseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Linklist_practice list = new Linklist_practice();
        list.add_last("0");
        list.add_last("2");
        list.add_last("4");
        list.add_last("5");
        

        System.out.println("Original list:");
        list.printList();

        list.reversseIterate();
        System.out.println("Reversed list:");
        list.printList();
    }
}
