package com.ajelimalai.leetcode.problems;


class AddTwoNumber {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean leading = false;
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode pRes = p1;


        while (p1 != null && p2 != null) {
            int s = p1.val + p2.val;
            if (leading) {
                s++;
            }
            leading = s >= 10;
            s = s % 10;
            pRes.val = s;

            p1 = p1.next;
            p2 = p2.next;
            if (p1 != null) {
                pRes = pRes.next;
            }
        }

        while (p1 != null) {
            int s = p1.val;
            if (leading) {
                s++;
            }
            leading = s >= 10;
            s = s % 10;
            pRes.val = s;
            p1 = p1.next;
            if (p1 != null) {
                pRes = pRes.next;
            }
        }

        while (p2 != null) {
            int s = p2.val;
            if (leading) {
                s++;
            }
            leading = s >= 10;
            s = s % 10;
            pRes.next = p2;
            pRes = pRes.next;
            pRes.val = s;
            p2 = p2.next;

        }
        if(leading){
            pRes.next = new ListNode(1);
        }

        return l1;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(9);

        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }
}