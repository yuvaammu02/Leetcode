// Last updated: 12/08/2026, 11:52:13
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long n = nums.length;
        long over = Long.MIN_VALUE;
        long INF = (long) 1e16;
        long curr = 0;
        long ori = Long.MIN_VALUE;
        for(int x:nums){
            curr = Math.max((long) x,curr +x);
            ori = Math.max(ori,curr);
        }
        over = Math.max(over,ori);
        for(int op =0;op<2;op++){
            long dp0= (long) -1e15;
            long dp1=(long) -1e15;
            long dp2 = (long) - 1e15;
            for(int i =0;i<n;i++){
                int val = nums[i];
                long tr = (op == 0) ? (val*(long)k):(val/(long)k);
                long ne = Math.max(dp1+val,dp2+val);
                long nex = Math.max(tr,Math.max(dp0+tr,dp1+tr));
                long next = Math.max(val,dp0+val);
                dp0 = next;
                dp1 = nex;
                dp2 = ne;
                over = Math.max(over,Math.max(dp0,Math.max(dp1,dp2)));
            }
        }
        return over;
    }
}