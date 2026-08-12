// Last updated: 12/08/2026, 12:27:08
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l =0,max = 0;
        for(int j =0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(j));
            max = Math.max(max,j-l+1);
        }
        return max;
    }
}