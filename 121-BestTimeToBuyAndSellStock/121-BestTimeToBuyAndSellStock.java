// Last updated: 12/08/2026, 12:21:04
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n < 1){
            return 0;
        }
        int[] dp = new int[n];
        int min = prices[0];
        dp[0] = 0;
        for(int i =1;i<n;i++){
            min = Math.min(prices[i],min);
            dp[i] = Math.max(dp[i-1],prices[i]-min);
        }
       return  dp[n-1];
    }
}