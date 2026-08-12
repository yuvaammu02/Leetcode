// Last updated: 12/08/2026, 12:09:14
class Solution {
    public int arrangeCoins(int n) {
        int r = 1;
        while(n >= r){
            n = n-r;
            r++;
        }
        return r-1;
    }
}