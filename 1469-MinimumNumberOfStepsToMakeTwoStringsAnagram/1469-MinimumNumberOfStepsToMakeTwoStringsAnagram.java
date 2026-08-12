// Last updated: 12/08/2026, 11:56:41
class Solution {
    public int minSteps(String s, String t) {
        int[] f = new int[26];
        for(int i =0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
            f[t.charAt(i)-'a']--;
        }
        int ans =0;
        for(int x : f){
            if(x >0){
                ans += x;
            }
        }
        return ans;
    }
}