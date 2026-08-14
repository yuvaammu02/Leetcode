// Last updated: 14/08/2026, 13:59:09
1import java.util.HashMap;
2import java.util.Map;
3class LRUCache {
4    private static class Node {
5        int key;
6        int value;
7        Node prev;
8        Node next;
9        Node (int key, int value) {
10            this.key = key;
11            this.value = value;
12        }
13    }
14    private final Map<Integer, Node> cache;
15    private final int capacity; 
16    private final Node head;
17    private final Node tail;
18    public LRUCache(int capacity) {
19        this.capacity = capacity;
20        this.cache = new HashMap<>();
21        this.head = new Node(0, 0);
22        this.tail = new Node(0, 0);
23        head.next = tail;
24        tail.prev = head;
25    }
26    
27    public int get(int key) {
28        Node node = cache.get(key);
29        if (node == null) {
30            return -1;
31        }
32        removeNode(node);
33        addToMostRecent(node);
34        return node.value;
35    }
36    public void put(int key, int value) {
37        if (cache.containsKey(key)) {
38            Node node = cache.get(key);
39            node.value=value;
40            removeNode(node);
41            addToMostRecent(node);
42            return;
43        }
44        Node newNode = new Node(key, value);
45        cache.put(key, newNode);
46        addToMostRecent(newNode);
47        if (cache.size() > capacity) {
48            Node leastRecent = head.next;
49            removeNode(leastRecent);
50            cache.remove(leastRecent.key);
51        }
52    }
53    private void removeNode(Node node) {
54        Node previous = node.prev;
55        Node next = node.next;
56
57        previous.next = next;
58        next.prev = previous;
59    }
60    private void addToMostRecent(Node node) {
61        Node oldMostRecent = tail.prev;
62        oldMostRecent.next = node;
63        node.prev = oldMostRecent;
64        node.next = tail;
65        tail.prev = node;
66    }
67}
68