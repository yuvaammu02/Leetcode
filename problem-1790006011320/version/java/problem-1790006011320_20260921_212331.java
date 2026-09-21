// Last updated: 21/09/2026, 21:23:31
1class Solution {
2    public long countIntersectingIntervals(int[][] intervals) {
3        int n = intervals.length;
4        if(n <= 1 ) return 0;
5        int[] s = new int[n];
6        for(int i =0;i<n;i++){
7            s[i] = intervals[i][0];
8        }
9        Arrays.sort(s);
10        long no =0;
11        for(int i =0;i<n;i++){
12            int e = intervals[i][1];
13            int st = n- ub(s,e);
14            no += st;
15        }
16        long tot = (long) n *(n-1)/2;
17        return tot - no;
18     }
19    private int ub(int[] arr ,int ta){
20        int l =0;
21        int h = arr.length;
22        while(l < h){
23            int m = l +(h-l)/2;
24            if(arr[m] <= ta){
25                l = m+1;
26            }
27            else{
28                h = m;
29            }
30        }
31        return l;
32    }
33}