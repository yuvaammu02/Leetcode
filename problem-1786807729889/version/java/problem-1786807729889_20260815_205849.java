// Last updated: 15/08/2026, 20:58:49
1class Solution {
2    public long elevatorRequests(int n, int start, int[] requests) {
3        Set<Integer> f = new HashSet<>();
4        f.add(start);
5        for(int r : requests){
6            f.add(r);
7        }
8        List<Integer> a = new ArrayList<>(f);
9        Collections.sort(a);
10        int m = a.size();
11        Set<Integer> re = new HashSet<>();
12        for(int r : requests){
13            re.add(r);
14        }
15        int t = re.size();
16        int[] pref = new int[m];
17        int s = -1;
18        for(int i =0;i<m;i++){
19            if(a.get(i) == start){
20                s = i;
21            }
22            pref[i] = (re.contains(a.get(i)) ? 1:0)+(i > 0 ? pref[i-1] : 0);
23        }
24        long[][][] dp = new long[m][m][2];
25        for(int i =0;i<m;i++){
26            for(int j =0;j<m;j++){
27                Arrays.fill(dp[i][j],Long.MAX_VALUE);
28            }
29        }
30        dp[s][s][0] =0;
31        dp[s][s][1] =0;
32        for(int l =1;l<= m;l++){
33            for(int i =0;i <= m-l;i++){
34                int j = i+l-1;
35                int fu = pref[j] - (i >0 ? pref[i-1] :0);
36                int un = t-fu;
37                if(dp[i][j][0] != Long.MAX_VALUE){
38                    if(i >0){
39                        long di = a.get(i) - a.get(i-1);
40                        dp[i-1][j][0] = Math.min(dp[i-1][j][0],dp[i][j][0] + di *un);
41                    }
42                    if(j < m-1){
43                        long di = a.get(j+1) - a.get(i);
44                        dp[i][j+1][1] = Math.min(dp[i][j+1][1],dp[i][j][0]+ di*un);
45                    }
46                }
47                if(dp[i][j][1] != Long.MAX_VALUE){
48                    if(i > 0){
49                        long di = a.get(j) - a.get(i-1);
50                        dp[i-1][j][0] = Math.min(dp[i-1][j][0],dp[i][j][1]+ di*un);
51                    }
52                    if(j <m-1){
53                        long di = a.get(j+1) - a.get(j);
54                        dp[i][j+1][1] = Math.min(dp[i][j+1][1],dp[i][j][1] + di*un);
55                    }
56                }
57            }
58        }
59        return Math.min(dp[0][m-1][0],dp[0][m-1][1]);
60    }
61}