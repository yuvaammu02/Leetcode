// Last updated: 12/08/2026, 11:49:34
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n == 1){
            return s;
        }
        long tot = n/2;
        return s + tot *(m-1)+1;
    }
}