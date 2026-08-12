// Last updated: 12/08/2026, 11:51:40
class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n = s.length();
        boolean[] res = new boolean[strs.length];
        int tot =0;
        for(int i =0;i<n;i++){
            if(s.charAt(i) == '0'){
                tot++;
            }
        }
        int[] pr = new int[n+1];
        for(int i =0;i<n;i++){
            pr[i+1] = pr[i] +(s.charAt(i) == '0' ? 1 : 0);
        }
        for(int idx =0;idx < strs.length;idx++){
            String tar = strs[idx];
            int zer =0;
            int ques =0;
            for(int i =0;i<n;i++){
                char ch = tar.charAt(i);
                if(ch == '0'){
                    zer++;
                }
                else if(ch == '?'){
                    ques++;
                }
            }
            if(zer > tot || zer+ques < tot){
                res[idx] = false;
                continue;
            }
            int nee = tot - zer;
            boolean isv = true;
            int curr = 0;
            int quest = 0;
            for(int i =0;i<n;i++){
                char ch = tar.charAt(i);
                if(ch == '0'){
                    curr++;
                } else if(ch == '?'){
                    if(quest < nee){
                        curr++;
                        quest++;
                    }
                }
                if(curr < pr[i+1]){
                    isv = false;
                    break;
                }
            }
            res[idx] = isv;
        }
        return res;
    }
}