// Last updated: 15/08/2026, 20:58:31
1class Solution {
2    public int minOperations(String s) {
3        int n = s.length();
4        int m = Integer.MAX_VALUE;
5        char[] arr = s.toCharArray();
6        for(int k =0;k<n;k++){
7            int c = 0;
8            int l =0;
9            int r = n-1;
10            while(l < r){
11                int c1 = arr[(l+k)%n];
12                int c2 = arr[(r+k)%n];
13                    int mi = Math.min((c2-c1+26)%26, (c1-c2+26)%26);
14                c += mi;
15                l++;
16                r--;
17            }
18            m = Math.min(m,c+k);
19        }
20        return m;
21    }
22}