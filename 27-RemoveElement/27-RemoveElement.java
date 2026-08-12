// Last updated: 12/08/2026, 12:25:25
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}