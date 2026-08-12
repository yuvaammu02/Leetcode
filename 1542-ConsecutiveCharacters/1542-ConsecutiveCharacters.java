// Last updated: 12/08/2026, 11:56:12
class Solution {
    public int maxPower(String s) {
       int max = 1;
       int c = 1;
       for(int i =1;i<s.length();i++){
         if(s.charAt(i) == s.charAt(i-1)){
            c++;
         }
         else{
            c=1;
         }
         max = Math.max(max,c);
       } 
       return max;
    }
}