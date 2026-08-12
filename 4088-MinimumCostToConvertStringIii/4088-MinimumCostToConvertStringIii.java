// Last updated: 12/08/2026, 11:51:26
class Solution {
    public int minCost(String source, String target, List<List<String>> rules, int[] costs) {
        if(source.length()!= target.length()){
            return -1;
        }
        int n = source.length();
        int m = rules.size();
        String[] pa = new String[m];
        String[] re = new String[m];
        int[] tot = new int[m];
        for(int i =0;i<m;i++){
            pa[i] = rules.get(i).get(0);
            re[i] = rules.get(i).get(1);
            int w =0;
            for(char c : pa[i].toCharArray()){
                if(c == '*'){
                    w++;
                }
            }
            tot[i] = costs[i] + w;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        dp[0] =0;
        for(int i =0;i<n;i++){
            if(dp[i] == Integer.MAX_VALUE/2) continue;
            if(source.charAt(i) == target.charAt(i)){
                dp[i+1] = Math.min(dp[i+1],dp[i]);
            }
            for(int k =0;k<m;k++){
                int l = pa[k].length();
                if(i+l <=n){
                    boolean isv = true;
                    for(int j =0;j<l;j++){
                        if(re[k].charAt(j) != target.charAt(i+j)){
                            isv = false;
                            break;
                        }
                    }
                    if(!isv) continue;
                    for(int j =0;j<l;j++){
                        char pc = pa[k].charAt(j);
                        if(pc != '*' && pc != source.charAt(i+j)){
                            isv = false;
                            break;
                        }
                    }
                    if(isv){
                        dp[i+l] = Math.min(dp[i+l],dp[i]+tot[k]); 
                    }
                }
            }
        }
        return dp[n] >= Integer.MAX_VALUE/2 ? -1 :dp[n];
    }
}