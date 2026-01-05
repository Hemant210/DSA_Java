package DSA;
// Circular queue using array
// public class Queue {
// // Inner static class implementing a queue using array
// static class Queuea {
// static int arr[];
// static int size;
// static int rear = -1;
// static int front = -1;

// // Constructor to initialize queue
// Queuea(int size) {
// this.size = size;
// arr = new int[size];
// rear = -1;
// }

// // Check if the queue is empty
// public static boolean isEmpty() {
// return rear == -1 && front == -1;
// }

// // Check if the queue is full
// public static boolean isFull() {
// // return rear == size - 1;
// return (rear + 1) % size == front;
// }

// // Add element to the rear of the queue
// public static void add(int data) {
// if (isFull()) {
// System.out.println("Overflow");
// return;
// }

// if (front == -1) {
// front = 0;
// }

// rear = (rear + 1) % size;
// arr[rear] = data;
// }

// // Remove element from the front (O(n) due to shifting)
// public static int remove() {
// if (isEmpty()) {
// System.out.println("empty queue");
// return -1;
// }

// int result = arr[front]; // Store front element to return
// // Shift elements left
// if (rear == front) {
// rear = front = -1;
// } else {
// front = (front + 1) % size;
// }
// return result;
// }

// // Peek the front element without removing
// public static int peek() {
// if (isEmpty()) {
// System.out.println("empty queue");
// return -1;
// }
// return arr[front];
// }
// }

// public static void main(String args[]) {
// Queuea q = new Queuea(5);
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5); // This will show "Overflow" because only 4 elements can be added
// in a circular
// // queue of size 5 (1 slot is left empty to distinguish full/empty)

// System.out.println("Removed: " + q.remove());
// q.add(6);
// System.out.println("Removed: " + q.remove());
// q.add(7);

// // Print and remove all elements one by one
// while (!q.isEmpty()) {
// System.out.println("Peek: " + q.peek());
// q.remove();

// }
// }
// }

// public class Queue {
// // Inner static class implementing a queue using array
// static class Queuea {
// static int arr[];
// static int size;
// static int rear;

// // Constructor to initialize queue
// Queuea(int size) {
// this.size = size;
// arr = new int[size];
// rear = -1;
// }

// // Check if the queue is empty
// public static boolean isEmpty() {
// return rear == -1;
// }

// // Check if the queue is full
// public static boolean isFull() {
// return rear == size - 1;
// }

// // Add element to the rear of the queue
// public static void add(int data) {
// if (isFull()) {
// System.out.println("Overflow"); // No space to add
// return;
// }
// arr[++rear] = data;
// }

// // Remove element from the front (O(n) due to shifting)
// public static int remove() {
// if (isEmpty()) {
// System.out.println("empty queue");
// return -1;
// }
// int front = arr[0]; // Store front element to return
// // Shift elements left
// for (int i = 0; i < rear; i++) {
// arr[i] = arr[i + 1];
// }
// rear--; // Shrink the size
// return front;
// }

// // Peek the front element without removing
// public static int peek() {
// if (isEmpty()) {
// System.out.println("empty queue");
// return -1;
// }
// return arr[0];
// }
// }

// public static void main(String args[]) {
// Queuea q = new Queuea(5);
// q.add(1);
// q.add(2);
// q.add(3);

// // Print and remove all elements one by one
// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }

// Queue using Linked List
// public class Queue {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// next = null;
// }
// }

// // Inner static class implementing a queue using array
// static class Queuea {
// static Node head = null;
// static Node tail = null;

// // Check if the queue is empty
// public static boolean isEmpty() {
// return head == null && tail == null;
// }

// // Add element to the rear of the queue
// public static void add(int data) {
// Node newNode = new Node(data);
// if (tail == null) {
// tail = head = newNode;
// }
// tail.next = newNode;
// tail = newNode;
// }

// // Remove element from the front (O(n) due to shifting)
// public static int remove() {
// if (isEmpty()) {
// System.out.println("empty queue");
// return -1;
// }

// int front = head.data;
// if (head == tail) {
// tail = null;
// }
// head = head.next;

// return front;
// }

// // Peek the front element without removing
// public static int peek() {
// if (isEmpty()) {
// System.out.println("empty queue");
// return -1;
// }
// return head.data;
// }
// }

// public static void main(String args[]) {
// Queuea q = new Queuea();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);

// // Print and remove all elements one by one
// while (!q.isEmpty()) {
// System.out.println("Peek: " + q.peek());
// q.remove();

// }
// }
// }
