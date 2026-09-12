// Last updated: 12/09/2026, 20:58:38
1class Solution {
2    public int[] maximumWeight(List<List<Integer>> intervals) {
3        int n = intervals.size();
4        int[][] iv = new int[n][3];
5        for (int i = 0; i < n; i++)
6            for (int c = 0; c < 3; c++) iv[i][c] = intervals.get(i).get(c);
7
8        Integer[] order = new Integer[n];
9        for (int i = 0; i < n; i++) order[i] = i;
10        Arrays.sort(order, (a, b) -> iv[a][1] - iv[b][1]);
11        int[] rights = new int[n];
12        for (int p = 0; p < n; p++) rights[p] = iv[order[p]][1];
13
14        long[] prevScore = new long[n + 1];
15        int[][] prevIds = new int[n + 1][0];
16        for (int k = 0; k < 4; k++) {
17            long[] curScore = new long[n + 1];
18            int[][] curIds = new int[n + 1][0];
19            for (int p = 1; p <= n; p++) {
20                int i = order[p - 1];  // take next interval
21                int l = iv[i][0], w = iv[i][2];
22                int lo = 0, hi = n;  // lower_bound: intervals ending before l
23                while (lo < hi) { 
24                    int mid = (lo + hi) >>> 1; 
25                    if (rights[mid] < l) lo = mid + 1; 
26                    else hi = mid; 
27                }
28
29                long takeScore = prevScore[lo] + w;
30                int[] takeIds = insertSorted(prevIds[lo], i);
31                if (better(takeScore, takeIds, curScore[p - 1], curIds[p - 1])) {
32                    curScore[p] = takeScore; 
33                    curIds[p] = takeIds;
34                } else {
35                    curScore[p] = curScore[p - 1]; 
36                    curIds[p] = curIds[p - 1];
37                }
38            }
39            prevScore = curScore; prevIds = curIds;
40        }
41        return prevIds[n];
42    }
43
44    private static boolean better(long s1, int[] a, long s2, int[] b) {
45        if (s1 != s2) return s1 > s2;  // higher score wins
46        int m = Math.min(a.length, b.length);
47        for (int i = 0; i < m; i++)
48            if (a[i] != b[i]) return a[i] < b[i];  // then lexicographically smaller
49        return a.length < b.length;
50    }
51
52    private static int[] insertSorted(int[] ids, int x) {
53        int[] out = new int[ids.length + 1];
54        int i = 0;
55        while (i < ids.length && ids[i] < x) { 
56            out[i] = ids[i]; 
57            i++; 
58        }
59        out[i] = x;
60        for (; i < ids.length; i++) 
61            out[i + 1] = ids[i];
62        return out;
63    }
64}