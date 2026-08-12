// Last updated: 12/08/2026, 11:53:12
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = -1.0;
        int res =0;
        for(int[] rec : dimensions){
            int l = rec[0];
            int b = rec[1];
            double d = Math.sqrt((double)l*l + (double)b*b);
            if(d > max){
                max = d;
                res = l*b;
            }
            else if(d == max){
                res = Math.max(res,l*b);
            }
        }
        return res;
    }
}