package Data_structure_Practice.Stacks_Queues;

import DSA.Leetcode.mergesorted.ListNode;

public class LRU {
    static class Node {
        int val;
        int key;
        ListNode prev;
        ListNode next;

        Node(int k, int v) {
            k = this.key;
            v = this.val;
            prev = next = null;
        }
    }

    ListNode head;
    ListNode tail;

    public static void main(String[] args) {

    }
}
