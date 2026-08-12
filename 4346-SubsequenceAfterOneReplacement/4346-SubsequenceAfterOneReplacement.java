// Last updated: 12/08/2026, 11:50:24
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n = s.length();
        int m0 = 0;
        int m1 =0;
        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);
            int next = m1;
            if(m1 <n && s.charAt(m1) == c){
                next = Math.max(next,m1+1);
            }
            if(m0 < n){
                next = Math.max(next,m0+1);
            }
            if(m0 < n &&s.charAt(m0) == c){
                m0++;
            }
            m1 = next;
            if(m0 == n|| m1 == n){
                return true;
            }
        }
        return m0 == n|| m1 == n;
    }
}