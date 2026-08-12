// Last updated: 12/08/2026, 12:26:28
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int cur = getValue(s.charAt(i));

            if(i<s.length()-1 && cur<getValue(s.charAt(i+1))){
                res-=cur;
            }
            else{
                res+=cur;
            }
        }
        return res;
    }

    private int getValue(char ch){
        switch(ch){
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
            default: return 0;
        }
    }
}