// Last updated: 12/08/2026, 12:23:06
class Solution {
    public int climbStairs(int n) {
        if(n<=1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0]=dp[1]=1;
            for(int i = 2;i<=n;i++){
                dp[i] = dp[i-1] +dp[i-2];
            }
            return dp[n];

    }
}