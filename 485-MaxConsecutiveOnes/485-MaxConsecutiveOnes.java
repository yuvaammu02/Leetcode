// Last updated: 12/08/2026, 12:08:03
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res =0;
        int count =0;
        for(int num : nums){
            if(num == 0){
                count =0;
            }
            else{
                count++;
            }
        if(res < count){
            res = count;
        }
    }
        return res;
}
}