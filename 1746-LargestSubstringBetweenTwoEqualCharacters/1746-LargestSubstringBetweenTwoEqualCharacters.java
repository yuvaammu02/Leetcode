// Last updated: 12/08/2026, 11:55:26
import java.util.*;
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] first = new int[26];
        Arrays.fill(first,-1);
        int ans = -1;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int in = ch-'a'; 
            if(first[in] == -1 ){
               first[in] = i;
            }
            else{
               ans = Math.max(ans,i-first[in]-1);
            }
        }
        return ans;
    }
}