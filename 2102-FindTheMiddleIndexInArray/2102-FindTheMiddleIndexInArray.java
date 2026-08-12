// Last updated: 12/08/2026, 11:54:37
class Solution {
    public int findMiddleIndex(int[] nums) {
        int tot = 0;
        int leftsum = 0;
        for(int num : nums){
            tot += num;
        }
        int rightsum =0;
        for(int i =0;i<nums.length;i++){
            rightsum = tot - leftsum - nums[i];
        if(leftsum == rightsum){
            return i;
        }
         leftsum += nums[i];
        }
        return -1;
        
    }
}