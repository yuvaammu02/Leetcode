// Last updated: 12/08/2026, 11:50:19
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n = nums.length;
        Arrays.sort(nums);
        long[] muls = new long[k];
        for(int i =0;i<k;i++){
            muls[i] = (long) mul-i;
        }
        Arrays.sort(muls);
        long cur = 0;
        for(int r =0;r<k;r++){
            long x = nums[n-1-r];
            long m = muls[k-1-r];
            cur += Math.max(x,x*m);
        }
        long max = cur;
        for(int i =1;i<=k;i++){
                long lx = nums[i-1];
                long lm = muls[i-1];
                cur += Math.max(lx,lx*lm);
                int d = k-i;
                long x = nums[n-1-d];
                long m = muls[k-1-d];
                cur -= Math.max(x,x*m);
            max = Math.max(max,cur);
        }
        return max;
    }
}