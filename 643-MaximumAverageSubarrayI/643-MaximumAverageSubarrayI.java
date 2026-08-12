// Last updated: 12/08/2026, 12:03:49
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wi =0;
        for(int i =0;i<k;i++){
            wi += nums[i];
        }
        int max = wi;
        for(int i =k;i<nums.length;i++){
            wi += nums[i];
            wi -= nums[i-k];
            max = Math.max(wi,max);
        }
        return (double) max/k;
    }
}