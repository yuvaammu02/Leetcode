// Last updated: 12/08/2026, 11:49:57
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sby = new StringBuilder();
        StringBuilder sbo = new StringBuilder();
        StringBuilder sbx = new StringBuilder();
        for(int i =0;i<s.length();
           i++){
            char ch = s.charAt(i);
            if(ch == y){
                sby.append(ch);
            }
            else if(ch == x){
                sbx.append(ch);
            }
            else{
                sbo.append(ch);
            }
           }
        return sby.append(sbo).append(sbx).toString();
    }
}