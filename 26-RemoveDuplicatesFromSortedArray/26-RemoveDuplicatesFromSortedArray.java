// Last updated: 12/08/2026, 12:25:35
class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
            for(int j = 1;j<nums.length;j++){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i]= nums[j];
                }
            }
            return i+1;
    }
}