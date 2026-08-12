// Last updated: 12/08/2026, 12:20:34
class Solution {
    public int singleNumber(int[] nums) {
        int o = 0;
        int t =0;
        for(int num : nums){
            o = (o ^ num) & ~t;
            t = (t ^ num) & ~o;
        }
        return o;
    }
}