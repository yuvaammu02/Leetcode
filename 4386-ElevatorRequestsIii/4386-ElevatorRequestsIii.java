// Last updated: 27/08/2026, 10:17:23
class Solution {
    public long elevatorRequests(int n, int start, int[][] requests) {
        int m = requests.length;
        int nu = 1 << m;
        long[][] dp = new long[nu][m];
        for(long[] r : dp){
            Arrays.fill(r,Long.MAX_VALUE);
        }
        for(int i =0;i<m;i++){
            int a = requests[i][0];
            int t = requests[i][1];
            long tr = Math.abs(t-start);
            dp[1 << i][i] = Math.max(tr,(long) a);
        }
        for(int ma = 1;ma <nu;ma++){
            for(int i =0;i<m;i++){
                if((ma & (1 << i)) == 0 || dp[ma][i] == Long.MAX_VALUE){
                    continue;
                }
                for(int j =0;j<m;j++){
                    if((ma &(1 <<j)) == 0){
                        int ne = ma | (1 << j);
                        long tra = Math.abs(requests[j][1] - requests[i][1]);
                        long re = dp[ma][i] + tra;
                        long fu = Math.max(re,(long)requests[j][0]);
                        if(fu < dp[ne][j]){
                            dp[ne][j] = fu;
                        }
                    }
                }
            }
        }
        long min = Long.MAX_VALUE;
        int all = nu-1;
        for(int i =0;i<m;i++){
            min = Math.min(min,dp[all][i]);
        }
        return min;
    }
}