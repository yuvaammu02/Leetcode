// Last updated: 12/08/2026, 12:03:25
class Solution {
    public boolean validPalindrome(String s) {
        int l =0;
        int r = s.length()-1;
        while(l <= r){
        if(s.charAt(l) == s.charAt(r)){
            l++;
            r--;
        }
        else{
            return ispalindrome(s,l+1,r) || ispalindrome(s,l,r-1);
        }
}
return true;
}
private boolean ispalindrome(String s,int left,int right){
    while(left <= right){
        if(s.charAt(left++) != s.charAt(right--)){
            return false;
        }
    }
    return true;
}
}