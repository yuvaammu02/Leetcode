// Last updated: 12/08/2026, 11:56:52
class Solution {
    public int removePalindromeSub(String s) {
        if(s.equals("")){
            return 0;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        if(s.equals(s1)){
            return 1;
        }
        else{
              return 2;
        }
    }
}