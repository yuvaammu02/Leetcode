// Last updated: 12/08/2026, 11:51:03
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int max = 1;
        for(int j = 1;j<n;j++){
            for(int a = 0;a<j;a++){
                boolean c = true;
                for(int i =0;i<m;i++){
                    if(Math.abs(grid[i][j]-grid[i][a]) > limit){
                        c = false;
                        break;
                    }
                }
                if(c){
                    dp[j] = Math.max(dp[j],dp[a] + 1);
                }
            }
            max = Math.max(max,dp[j]);
        }
        return max;
    }
}