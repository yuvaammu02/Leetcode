// Last updated: 12/08/2026, 11:50:09
class Solution {
    public int largestInteger(int n, int s) {
        if(s > n*9){
            return -1;
        }
        int res= 0;
        for(int i =0;i<n;i++){
            int di = Math.min(9,s);
            res = res*10+di;
            s -= di;
        }
        return res;
    }
}