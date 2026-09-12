// Last updated: 12/09/2026, 21:15:44
1class Solution {
2    public int minDays(int n) {
3     int[] dp = new int[n+1];
4    Arrays.fill(dp,Integer.MAX_VALUE);
5        dp[0] =0;
6        for(int i =0;i<=n;i++){
7            if(dp[i] == Integer.MAX_VALUE){
8                continue;
9            }
10            for(int k = 1; ;k++){
11                int s = k*(k+1)/2;
12                if(i+s > n)
13                   {
14                    break;
15                   }      
16            int d = (i ==0) ? k : (k+1);
17            if(dp[i] +d < dp[i+s]){
18                dp[i+s] = dp[i] +d;
19            }
20            }
21        }
22        return dp[n];
23    }
24}