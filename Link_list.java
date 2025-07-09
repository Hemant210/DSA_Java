public class Link_list {
    Node head;

    class Node {
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //Add - First
    public void add_first(String data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add - Last
    public void add_last(String data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //Print data 
    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        Link_list list = new Link_list();
        list.add_first("a");
        list.add_first("is");
        list.printList();

        list.add_last("List");
        list.printList();

        list.add_first("This");
        list.printList();
    }
}
