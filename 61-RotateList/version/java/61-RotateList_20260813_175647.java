// Last updated: 13/08/2026, 17:56:47
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0) {
14            return head;
15        }
16        int n = 1;
17        ListNode tail = head;
18        while (tail.next != null) {
19            tail = tail.next;
20            n++;
21        }
22        k = k % n;
23        if (k == 0) {
24            return head;
25        }
26        tail.next = head;
27        int steps = n - k;
28        ListNode newTail = head;
29        for (int i = 1; i < steps; i++) {
30            newTail = newTail.next;
31        }
32        ListNode newHead = newTail.next;
33        newTail.next = null;
34
35        return newHead;
36    }
37}
38