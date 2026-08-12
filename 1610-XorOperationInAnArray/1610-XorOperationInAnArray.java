// Last updated: 12/08/2026, 11:55:55
class Solution {
    public int xorOperation(int n, int start) {
        int res = start;
        for(int i =1;i<n;i++){
            res = res ^ (start + 2 * i);
        }
        return res;
    }
}