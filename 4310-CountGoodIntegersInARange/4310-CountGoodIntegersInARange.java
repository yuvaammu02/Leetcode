// Last updated: 12/08/2026, 11:50:55
class Solution {
    public long goodIntegers(long l, long r, int k) {
        long[] bounds = {r,l-1};
        long[] counts = new long[2];
        for(int b = 0;b < 2;b++){
            long n = bounds[b];
            if(n <= 0){
                counts[b] = 0;
                continue;
            }
            String s = Long.toString(n);
            int len = s.length();
            long[][][][] dp = new long[len +1][11][2][2];
            dp[0][10][0][0] = 1;
            for(int i =0;i<len;i++){
                int currentDigit = s.charAt(i) - '0';
                for(int last =0;last <= 10;last++){
                    for(int less = 0;less < 2;less++){
                        for(int started = 0;started < 2;started++){
                            long ways = dp[i][last][less][started];
                            if(ways == 0) continue;
                            int limit = (less == 1) ? 9 : currentDigit;
                            for(int d = 0;d <= limit;d++){
                             int nextLess = (less == 1 || d < limit) ? 1 : 0;
                             int nextStarted = (started ==1 || d > 0) ? 1: 0;
                                if(nextStarted == 0){
                                    dp[i+1][10][nextLess][0] += ways;
                                }
                                else{
                                if(started == 0 || Math.abs(d - last) <= k){
                                    dp[i+1][d][nextLess][1] += ways;
                                }
                                }
                            }
                        }
                    }
                }
            }
            long total = 0;
            for(int last = 0;last <= 9;last++){
                for(int less =0;less < 2;less++){
                    total += dp[len][last][less][1];
                }
            }
            counts[b] = total;
        }
        return (counts[0] - counts[1]);
    }
}