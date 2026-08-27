// Last updated: 27/08/2026, 10:17:16
class Solution {
    public long elevatorRequests(int n, int start, int[] requests) {
        Set<Integer> f = new HashSet<>();
        f.add(start);
        for(int r : requests){
            f.add(r);
        }
        List<Integer> a = new ArrayList<>(f);
        Collections.sort(a);
        int m = a.size();
        Set<Integer> re = new HashSet<>();
        for(int r : requests){
            re.add(r);
        }
        int t = re.size();
        int[] pref = new int[m];
        int s = -1;
        for(int i =0;i<m;i++){
            if(a.get(i) == start){
                s = i;
            }
            pref[i] = (re.contains(a.get(i)) ? 1:0)+(i > 0 ? pref[i-1] : 0);
        }
        long[][][] dp = new long[m][m][2];
        for(int i =0;i<m;i++){
            for(int j =0;j<m;j++){
                Arrays.fill(dp[i][j],Long.MAX_VALUE);
            }
        }
        dp[s][s][0] =0;
        dp[s][s][1] =0;
        for(int l =1;l<= m;l++){
            for(int i =0;i <= m-l;i++){
                int j = i+l-1;
                int fu = pref[j] - (i >0 ? pref[i-1] :0);
                int un = t-fu;
                if(dp[i][j][0] != Long.MAX_VALUE){
                    if(i >0){
                        long di = a.get(i) - a.get(i-1);
                        dp[i-1][j][0] = Math.min(dp[i-1][j][0],dp[i][j][0] + di *un);
                    }
                    if(j < m-1){
                        long di = a.get(j+1) - a.get(i);
                        dp[i][j+1][1] = Math.min(dp[i][j+1][1],dp[i][j][0]+ di*un);
                    }
                }
                if(dp[i][j][1] != Long.MAX_VALUE){
                    if(i > 0){
                        long di = a.get(j) - a.get(i-1);
                        dp[i-1][j][0] = Math.min(dp[i-1][j][0],dp[i][j][1]+ di*un);
                    }
                    if(j <m-1){
                        long di = a.get(j+1) - a.get(j);
                        dp[i][j+1][1] = Math.min(dp[i][j+1][1],dp[i][j][1] + di*un);
                    }
                }
            }
        }
        return Math.min(dp[0][m-1][0],dp[0][m-1][1]);
    }
}