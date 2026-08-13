// Last updated: 13/08/2026, 17:54:50
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
12
13    public void reorderList(ListNode head) {
14
15        if(head == null || head.next == null){
16            return;
17        }
18
19        // Step 1: Find Middle
20
21        ListNode slow = head;
22        ListNode fast = head;
23
24        while(fast.next != null && fast.next.next != null){
25            slow = slow.next;
26            fast = fast.next.next;
27        }
28
29        // Step 2: Split List
30
31        ListNode second = slow.next;
32        slow.next = null;
33
34        // Step 3: Reverse Second Half
35
36        ListNode prev = null;
37
38        while(second != null){
39
40            ListNode next = second.next;
41
42            second.next = prev;
43
44            prev = second;
45            second = next;
46        }
47
48        second = prev;
49
50        // Step 4: Merge Both Halves
51
52        ListNode first = head;
53
54        while(second != null){
55
56            ListNode temp1 = first.next;
57            ListNode temp2 = second.next;
58
59            first.next = second;
60            second.next = temp1;
61
62            first = temp1;
63            second = temp2;
64        }
65    }
66}