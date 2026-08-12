// Last updated: 12/08/2026, 11:51:56
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;
        int mask = 0;
        for (int num : nums) {
            mask |= num;
        }
        return mask + 1;
    }
}