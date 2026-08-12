// Last updated: 12/08/2026, 12:05:01
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0) return m*n;
        int minrow = m;
        int mincol = n;
        for(int[] op : ops){
            minrow = Math.min(minrow,op[0]);
            mincol = Math.min(mincol,op[1]);
        }
        return minrow * mincol;
    }
}