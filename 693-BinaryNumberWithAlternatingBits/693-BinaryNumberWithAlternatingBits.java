// Last updated: 12/08/2026, 12:03:19
class Solution {
    public boolean hasAlternatingBits(int n) {
        int p = n%2;
        n /= 2;
        while(n >0){
            int c = n%2;
            if(c == p){
                return false;
            }
            p = c;
            n /= 2;
        }
        return true;
    }
}