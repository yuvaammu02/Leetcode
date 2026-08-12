// Last updated: 12/08/2026, 12:06:06
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result =0;
        for(int i =0;i<nums.length;i+=2){
            result += nums[i];
        }
        return result;
    }
}