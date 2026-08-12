// Last updated: 12/08/2026, 11:49:54
class Solution {
    public int maxDigitRange(int[] nums) {
        int mr = -1;
        int su  =0;
        for(int num : nums){
            int r = getDigitRange(num);
            if(r > mr){
                mr = r;
                su = num;
            }
            else if(r == mr){
                su += num;
            }
        }
        return su;
    }
    private int getDigitRange(int num){
        if(num == 0) return 0;
        int maxd = 0;
        int mind = 9;
        num = Math.abs(num);
        while(num > 0){
            int d = num%10;
            maxd = Math.max(maxd,d);
            mind = Math.min(mind,d);
            num /= 10;
        }
        return maxd-mind;
    }
}