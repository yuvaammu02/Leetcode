// Last updated: 12/08/2026, 12:19:32
class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int r = nums.length-1;
        while(l < r){
            int m = (l+r)/2;
            if(nums[m] < nums[r]){
                r = m;
            }
            else if(nums[m] > nums[r]){
                l = m+1;
            }
            else{
                r--;
            }
        }
        return nums[l];
    }
}