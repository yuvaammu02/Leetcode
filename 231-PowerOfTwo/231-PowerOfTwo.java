// Last updated: 12/08/2026, 12:14:59
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n >0 && (n & (n-1)) == 0;
}
}