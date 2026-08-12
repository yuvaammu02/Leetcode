// Last updated: 12/08/2026, 11:49:36
class Solution {
    public long maxPairStrength(int[] nums) {
        long max =0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
            int a = nums[i];
            int b = nums[j];
            while(b !=0){
                int t = b;
                b = a%b;
                a =t;
            }
            long gcd = a;
            long s = ((long) nums[i] * nums[j])/(gcd*gcd);
            if(s >max){
                max = s;
            }
        }
    }
        return max;
    }
    
}