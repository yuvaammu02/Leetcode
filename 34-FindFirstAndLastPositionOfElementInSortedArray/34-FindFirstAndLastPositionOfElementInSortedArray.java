// Last updated: 12/08/2026, 12:24:57
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = (l+r)/2;
            if(nums[m] == target){
                result[0] = m;
                r = m-1;
            }
            else if(nums[m] > target){
                 r = m-1;
            }
            else{
                l = m+1;
            }
        }
        l = 0;
        r = nums.length-1;
        while(l <= r){
            int m = (l+r)/2;
            if(nums[m] == target){
                result[1] = m;
                 l = m+1;
            }
            else if(nums[m] < target){
                 l = m+1;
            }
            else{
                r  = m-1;
            }
        }
        return result;
    }
}