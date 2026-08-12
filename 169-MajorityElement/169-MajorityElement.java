// Last updated: 12/08/2026, 12:18:49
class Solution {
    public int majorityElement(int[] nums) {
        int count =1;
        int can = 0;
        for(int i =0;i<nums.length;i++){
            if(count == 1){
                can = nums[i];
            }
            if(nums[i] == can){
                count +=1;
            }
            else{
                count -= 1;
            }
        }
        return can;  
    }
}