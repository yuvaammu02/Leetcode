// Last updated: 12/08/2026, 12:00:09
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0,maxSum=nums[0],currentMax=0,minSum=nums[0],currentMin=0;
        for(int num:nums){
            currentMax=Math.max(num,currentMax+num);
            maxSum=Math.max(maxSum,currentMax);
            currentMin=Math.min(num,currentMin+num);
            minSum=Math.min(minSum,currentMin);
            totalSum+=num;
        }
        if(maxSum<0)return maxSum;
        return Math.max(maxSum,totalSum-minSum);
    }
}