// Last updated: 14/08/2026, 13:53:26
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15public class Solution {
16    public Node copyRandomList(Node head) {
17        if (head == null) return null;
18        HashMap<Node, Node> oldToNew = new HashMap<>();
19        Node curr = head;
20        while (curr != null) {
21            oldToNew.put(curr, new Node(curr.val));
22            curr = curr.next;
23        }
24        curr = head;
25        while (curr != null) {
26            oldToNew.get(curr).next = oldToNew.get(curr.next);
27            oldToNew.get(curr).random = oldToNew.get(curr.random);
28            curr = curr.next;
29        }     
30        return oldToNew.get(head);
31    }
32}