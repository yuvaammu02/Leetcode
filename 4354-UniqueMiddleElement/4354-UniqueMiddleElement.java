// Last updated: 12/08/2026, 11:50:01
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
       int n = nums.length;
        int mid = nums[n/2];
        int c =0;
        for(int num : nums){
            if(num == mid){
                c++;
            }
        }
        return c == 1;
    }
}