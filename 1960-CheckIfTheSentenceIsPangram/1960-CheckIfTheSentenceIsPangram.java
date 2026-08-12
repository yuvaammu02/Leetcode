// Last updated: 12/08/2026, 11:54:49
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for(int i =0;i<sentence.length();i++){
           char ch = sentence.charAt(i);
           seen[ch-'a'] = true;
        }
        for(boolean l : seen){
            if(!l){
                return false;
            }
        }
        return true;
    }
}