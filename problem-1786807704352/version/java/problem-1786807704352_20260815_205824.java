// Last updated: 15/08/2026, 20:58:24
1class Solution {
2    public int elevatorRequests(int n, int[] requests) {
3        int t =0;
4        int c =0;
5        for(int req : requests){
6            t += Math.abs(req-c);
7            c = req;
8        }
9        return t;
10    }
11}