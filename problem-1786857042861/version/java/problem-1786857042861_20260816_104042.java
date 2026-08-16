// Last updated: 16/08/2026, 10:40:42
1class Solution {
2    public int maximumGap(String skill, String station) {
3        int n = skill.length();
4        int m = station.length();
5        if(n == 1){
6            return 0;
7        }
8        int[] l = new int[n];
9        int[] r = new int[n];
10        int s =0;
11        for(int i =0;i<n;i++){
12            while(s < m && station.charAt(s) != skill.charAt(i)){
13                s++;
14            }
15            l[i]   = s;
16            s++;
17        }
18        s = m-1;
19        for(int i = n-1;i>=0;i--){
20            while(s >=0 && station.charAt(s) != skill.charAt(i)){
21                s--;
22            }
23            r[i] = s;
24            s--;
25        }
26        int ma = 0;
27        for(int i = 1;i<n;i++){
28            ma = Math.max(ma,r[i]- l[i-1]);
29        }
30        return ma;
31    }
32}