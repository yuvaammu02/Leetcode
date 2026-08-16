// Last updated: 16/08/2026, 10:54:43
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int m = 0;
4        for(int l : lights){
5            m = Math.max(m,l);
6        }
7        int mp = 0;
8        for(int t : arrivalTime){
9            int r = t%period;
10            if(r >= m){
11                int w = period - r;
12                mp = Math.max(mp,w);
13            }
14        }
15        return mp;
16    }
17}