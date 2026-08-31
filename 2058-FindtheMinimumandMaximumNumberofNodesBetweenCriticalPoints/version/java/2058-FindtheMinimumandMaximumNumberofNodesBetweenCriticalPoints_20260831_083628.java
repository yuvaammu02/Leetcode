// Last updated: 31/08/2026, 08:36:28
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
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        int Min = 100000, i = 1;
14        int first = 0, last = 0;
15        ListNode prev = head, curr = head.next, nxt = head.next.next;
16        while (nxt != null) {
17            if (isCrit(prev, curr, nxt)) {
18                if (first == 0) first = i;
19                else Min = Math.min(Min, i - last);
20                last = i;
21            }
22            prev = curr; curr = nxt;
23            nxt = nxt.next; i++;
24        }
25        if (first == last) return new int[]{-1, -1};
26        return new int[]{Min, last - first};
27    }
28    boolean isCrit(ListNode a, ListNode b, ListNode c) {
29        return (a.val < b.val && b.val > c.val) ||
30               (a.val > b.val && b.val < c.val);
31    }
32}