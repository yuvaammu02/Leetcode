// Last updated: 12/08/2026, 12:19:09
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;  
        }
        int l =0;
        int r = nums.length-1;
        while(l < r){
            int m = (l +r)/2;
            if(nums[m] < nums[m + 1]){
                l = m+1;
            }
            else{
                r = m;
            }
                    }
                    return l; 
    }
}