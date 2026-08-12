// Last updated: 12/08/2026, 11:53:44
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int r =0;
        String t = "01";
        while(t.length() <= s.length()){
            if(s.contains(t))
                r = t.length();
            t = "0" + t +"1";
        }
        return r;
    }
}