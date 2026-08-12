// Last updated: 12/08/2026, 11:55:03
class Solution {
    public boolean check(int[] nums) {
        int c =0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i] > nums[(i+1) % n]){
                c++;
            }
        }
        return c <= 1;
    }
}