// Last updated: 21/09/2026, 21:14:23
1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        int c =0;
4        int n = intervals.length;
5        for(int i =0;i<n;i++){
6            for(int j =i+1 ;j<n;j++){
7                int s = intervals[i][0];
8                int e = intervals[i][1];
9                int s2 = intervals[j][0];
10                int e2 = intervals[j][1];
11                if(Math.max(s,s2) <= Math.min(e,e2)){
12                    c++;
13                }
14            }
15        }
16        return c;
17    }
18}