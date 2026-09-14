// Last updated: 14/09/2026, 18:08:24
1class Solution {
2    public long shadowPairs(int[] nums) {
3        int n = nums.length;
4        int[] r = new int[n];
5        Deque<Integer> s = new ArrayDeque<>();
6        for(int i = n-1;i>=0;i--){
7            while(!s.isEmpty() && nums[s.peek()] >= nums[i]){
8                s.pop();
9            }
10            r[i] = s.isEmpty() ? n : s.peek();
11            s.push(i);
12        }
13        List<Integer> in = new ArrayList<>();
14        for(int i =0;i<n;i++){
15            in.add(i);
16        }
17        in.sort((a,b) -> Integer.compare(nums[b],nums[a]));
18        FenwickTree bit = new FenwickTree(n);
19        long t =0;
20        int i =0;
21        while(i <n){
22            int j = i;
23            while(j < n && nums[in.get(j)] == nums[in.get(i)]){
24                j++;
25            }
26            for(int k = i;k<j;k++){
27                int idx = in.get(k);
28                int ri = r[idx];
29                int c = bit.query(ri) - bit.query(idx+1);
30                t += c;
31            }
32            for(int k = i;k<j;k++){
33                bit.update(in.get(k) +1 ,1);
34            }
35            i =j;
36        }
37        return t;
38        
39    }
40    private static class FenwickTree{
41        private final int[] tree;
42        private final int size;
43        public FenwickTree(int n){
44            this.size = n;
45            this.tree = new int[n+1];
46        }
47        public void update(int i,int delta){
48            while(i <= size){
49                tree[i] += delta;
50                i += i & (-i);
51            }
52        }
53        public int query(int i){
54            int s =0;
55            while(i > 0){
56                s += tree[i];
57                i -= i & (-i);
58            }
59            return s;
60        }
61    }
62}