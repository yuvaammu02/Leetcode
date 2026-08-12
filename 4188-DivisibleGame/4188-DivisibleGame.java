// Last updated: 12/08/2026, 11:51:11
class Solution {
 public int divisibleGame(int[] nums) {
        int n=nums.length;
        int MOD=1_000_000_007;

        Set<Integer> candSet=new HashSet<>();

        int max=nums[0];

        for(int num: nums){
            max=Math.max(max,num);
            for(int i=2;i<=num/i;i++){
                if(num%i==0){
                    candSet.add(i);
                    candSet.add(num/i);
                }
            }
            if(num>1) candSet.add(num);
        }


        List<Integer> cand= new ArrayList<>(candSet);


        int bestK = Integer.MAX_VALUE;
        long bestDiff = Long.MIN_VALUE;

        for(int k: cand){
            long diff=maxSumArray(nums,k);
            if (diff > bestDiff) {
                bestDiff = diff;
                bestK = k;
            } else if (diff == bestDiff) {
                bestK = Math.min(bestK, k);
            }
        }

        if(max==1){
            bestK=2;
            bestDiff=maxSumArray(nums,2);
        }

        long a = ((bestDiff % MOD) + MOD) % MOD;
        long b = ((long) bestK % MOD + MOD) % MOD;
        long result = (a * b) % MOD;
        return (int) result;
    }
    
    private long maxSumArray(int[] nums, int k){
        long max=Integer.MIN_VALUE;
        long temp=0;
        for(int num: nums){
            long val= (num%k==0)?num:-num;
            temp=Math.max(val, temp+val);
            max=Math.max(max,temp);
        }
        return max;
    }
}