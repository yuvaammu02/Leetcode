// Last updated: 12/08/2026, 12:17:05
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0){
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
}