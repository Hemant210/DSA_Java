public class Queue {
    // Inner static class implementing a queue using array
    static class Queuea {
        static int arr[];
        static int size;
        static int rear;

        // Constructor to initialize queue
        Queuea(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // Check if the queue is full
        public static boolean isFull() {
            return rear == size - 1;
        }

        // Add element to the rear of the queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Overflow"); // No space to add
                return;
            }
            arr[++rear] = data;
        }

        // Remove element from the front (O(n) due to shifting)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0]; // Store front element to return
            // Shift elements left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--; // Shrink the size
            return front;
        }

        // Peek the front element without removing
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queuea q = new Queuea(5);
        q.add(1);
        q.add(2);
        q.add(3);

        // Print and remove all elements one by one
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
