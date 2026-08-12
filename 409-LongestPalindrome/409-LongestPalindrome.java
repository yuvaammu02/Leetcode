// Last updated: 12/08/2026, 12:09:54
class Solution {
    public int longestPalindrome(String s) {
        int odd =0;
        Map<Character,Integer> map =  new HashMap<>();
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
            if(map.get(c) %2 == 1){
                odd++;
            }
            else{
                odd--;
            }
        }
            if(odd > 1){
                return s.length() - odd + 1;
            }
            return s.length(); 
    }
}