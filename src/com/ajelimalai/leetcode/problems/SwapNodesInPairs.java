package com.ajelimalai.leetcode.problems;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 * <p>
 * <p>
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode result = new SwapNodesInPairs().swapPairs(head);
        print(result);

    }

    private static void print(ListNode result) {
        System.out.println();
        while (result != null) {
            System.out.print(result.val);
            System.out.print(", ");
            result = result.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode prev = head;
        ListNode prev2 = head;
        boolean swap = false;
        while (current != null) {
            if (swap) {
                prev.next = current.next;
                current.next = prev;
                if (prev2 == head) {
                    head = current;
                }else{
                    prev2.next = current;
                }
                ListNode temp = current;
                current = prev;
                prev = temp;
            }
            swap = !swap;
            prev2 = prev;
            prev = current;
            current = current.next;
        }
        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}



