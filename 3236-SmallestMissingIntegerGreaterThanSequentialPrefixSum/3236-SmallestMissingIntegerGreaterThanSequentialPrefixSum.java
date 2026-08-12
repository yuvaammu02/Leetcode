// Last updated: 12/08/2026, 11:53:18
class Solution {
    public int missingInteger(int[] nums) {
        int count = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i-1] + 1 == nums[i]) count += nums[i];
            else break;
        }
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(count == nums[i]){
                count++;
            }
        }
        return count;
    }
}