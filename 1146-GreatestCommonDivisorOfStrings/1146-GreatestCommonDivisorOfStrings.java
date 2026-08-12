// Last updated: 12/08/2026, 11:58:59
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
    return "";
}  
int len = gcd(str1.length(),str2.length());
return str1.substring(0,len);
  }
  private int gcd(int len1,int len2){
    while(len2 != 0){
        int temp = len2;
        len2 = len1%len2;
        len1 = temp;
    }
    return len1;

  }
}