// Last updated: 12/08/2026, 11:59:22
class Solution {
    public int longestOnes(int[] nums, int k) {
        int i =0;
        int j =0;
        int maxlen =0;
        int zero =0;
        while(j < nums.length){
            if(nums[j]==0) zero++;
            if(zero > k){
                if(nums[i] == 0)
                    zero--;
                    i++;
            }
            if(zero<= k){
                int len = j-i+1;
                maxlen = Math.max(maxlen,len);
            }
            j++;
        }
        return maxlen;
    }
}