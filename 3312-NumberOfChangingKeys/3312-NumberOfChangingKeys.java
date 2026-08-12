// Last updated: 12/08/2026, 11:52:48
class Solution {
    public int countKeyChanges(String s) {
        int c =0;
        for(int i =1;i<s.length();i++){
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i-1))){
                c++;
            }
        }
        return c;
    }
}