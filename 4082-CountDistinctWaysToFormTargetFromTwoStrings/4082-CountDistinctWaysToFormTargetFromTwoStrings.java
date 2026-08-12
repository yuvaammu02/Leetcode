// Last updated: 12/08/2026, 11:51:27
class Solution {
    public int interleaveCharacters(String word1, String word2, String target) {
        int m = word1.length();
        int n = word2.length();
        int l = target.length();
        int mod = 1_000_000_007;
        int[][] dp = new int[m+1][n+1];
        for(int i =0;i<=m;i++){
            for(int j =0;j<=n;j++){
                dp[i][j] = 1;
            }
        }
        for(int k = l-1;k>=0;k--){
            char tc = target.charAt(k);
            int[][] next = new int[m+1][n+1];
            int[][] match = new int[m+1][n+1];
            for(int j =0;j<=n;j++){
                for(int i = m-1;i>=0;i--){
                    match[i][j] = match[i+1][j];
                    if(word1.charAt(i) == tc){
                        match[i][j] = (match[i][j] + dp[i+1][j])%mod;
                    }
                }
            }
            int[][] match1 = new int[m+1][n+1];
            for(int i =0;i<=m;i++){
                for(int j = n-1;j>=0;j--){
                    match1[i][j] = match1[i][j+1];
                    if(word2.charAt(j) == tc){
                        match1[i][j] = (match1[i][j]+dp[i][j+1])%mod;
                    }
                }
            }
            for(int i =0;i<=m;i++){
                for(int j =0;j<=n;j++){
                    next[i][j] = (match[i][j] + match1[i][j])%mod;
                }
            }
            dp = next;
        }
        int tw = dp[0][0];
        int pw1 = countpureways(word1,target);
        int pw2 = countpureways(word2,target);
        int ans = (tw-pw1-pw2)%mod;
        if(ans < 0) ans += mod;
        return ans;
    }
    private int countpureways(String word,String target){
        int m = word.length();
        int l = target.length();
        int mod = 1_000_000_007;
        int[] dp = new int[m+1];
        Arrays.fill(dp,1);
        for(int k = l-1;k>=0;k--){
            char tc = target.charAt(k);
            int[] next = new int[m+1];
            int sum =0;
            for(int i = m-1;i>=0;i--){
                if(word.charAt(i) == tc){
                    sum = (sum +dp[i+1])%mod;
                }
                next[i] = sum;
            }
            dp = next;
        }
        return dp[0];
    }
}