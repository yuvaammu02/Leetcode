// Last updated: 12/08/2026, 11:50:33
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        for(int j =k;j<n;j++){
            curr = Math.max(curr,nums[j-k]);
            max = Math.max(max,curr+nums[j]);
        }
        return max;
    }
}