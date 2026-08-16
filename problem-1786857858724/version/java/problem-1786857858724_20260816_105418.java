// Last updated: 16/08/2026, 10:54:18
1class Solution {
2    public long elevatorRequests(int n, int start, int[][] requests) {
3        int m = requests.length;
4        int nu = 1 << m;
5        long[][] dp = new long[nu][m];
6        for(long[] r : dp){
7            Arrays.fill(r,Long.MAX_VALUE);
8        }
9        for(int i =0;i<m;i++){
10            int a = requests[i][0];
11            int t = requests[i][1];
12            long tr = Math.abs(t-start);
13            dp[1 << i][i] = Math.max(tr,(long) a);
14        }
15        for(int ma = 1;ma <nu;ma++){
16            for(int i =0;i<m;i++){
17                if((ma & (1 << i)) == 0 || dp[ma][i] == Long.MAX_VALUE){
18                    continue;
19                }
20                for(int j =0;j<m;j++){
21                    if((ma &(1 <<j)) == 0){
22                        int ne = ma | (1 << j);
23                        long tra = Math.abs(requests[j][1] - requests[i][1]);
24                        long re = dp[ma][i] + tra;
25                        long fu = Math.max(re,(long)requests[j][0]);
26                        if(fu < dp[ne][j]){
27                            dp[ne][j] = fu;
28                        }
29                    }
30                }
31            }
32        }
33        long min = Long.MAX_VALUE;
34        int all = nu-1;
35        for(int i =0;i<m;i++){
36            min = Math.min(min,dp[all][i]);
37        }
38        return min;
39    }
40}