// Last updated: 12/08/2026, 11:54:26
class Solution {
    public int minimumMoves(String s) {
        int i =0;
        int st =0;
        while(i < s.length()){
            if(s.charAt(i) == 'X'){
                i = i+3;
                st++;
            }
            else{
                i++;
            }
        }
        return st;
    }
}