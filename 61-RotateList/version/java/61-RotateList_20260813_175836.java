// Last updated: 13/08/2026, 17:58:36
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode left = new ListNode(0);
14        ListNode right = new ListNode(0);
15        
16        ListNode leftTail = left;
17        ListNode rightTail = right;
18        
19        while(head != null){
20            if(head.val < x){
21                leftTail.next = head;
22                leftTail = leftTail.next;
23            }
24            else{
25                rightTail.next = head;
26                rightTail = rightTail.next;
27            }
28            head = head.next;
29        }
30        
31        leftTail.next = right.next;
32        rightTail.next = null;
33        
34        return left.next;
35    }
36}