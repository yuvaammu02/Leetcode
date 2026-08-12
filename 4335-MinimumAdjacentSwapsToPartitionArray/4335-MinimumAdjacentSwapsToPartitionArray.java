// Last updated: 12/08/2026, 11:50:40
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long s =0;
        long c1 =0;
        long c2 =0;
        long mod = 1_000_000_007;
        for(int num : nums){
            if(num < a){
                s = (s +c1+c2)%mod;
            }
            else if(num <=b){
                s = (s + c2)%mod;
                c1++;
            }
            else{
                c2++;
            }
        }
        return (int) s;
    }
}