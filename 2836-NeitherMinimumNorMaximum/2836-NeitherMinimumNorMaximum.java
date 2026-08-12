// Last updated: 12/08/2026, 11:53:34
class Solution {
    public int findNonMinOrMax(int[] nums) {
       int  min = nums[0];
       int  max = nums[0];
        for(int num:nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != min && nums[i] != max){
                return nums[i];
            }
        }
        return -1;
    }
}