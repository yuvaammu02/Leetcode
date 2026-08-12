// Last updated: 12/08/2026, 11:50:17
class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n = monsters.length;
        long[] diff = new long[n+1];
        for(int[] b : boosts){
            diff[b[0]] += b[2];
            if(b[1] +1 <n){
                diff[b[1] + 1] -= b[2];
            }
        }
        long[] bonus = new long[n]; 
        long c =0;
        for(int i =0;i<n;i++){
            c += diff[i];
            bonus[i] = c;
        }
        long l =0;
        long h =0;
        for(int m : monsters) h += m;
        while(l < h){
            long mid = l + (h-l)/2;
                if(candefeat(mid,monsters,bonus)){
                    h = mid;
                }
            else{
                l = mid +1;
            }
        }
        return l;
    }
    private boolean candefeat(long strength,int[] monsters,long[] bonus){
        long cur = strength;
        for(int i =0;i<monsters.length;i++){
            if(cur + bonus[i] < monsters[i]){
                return false;
            }
            cur -= monsters[i];
            if(cur <0) cur =0;
        }
        return true;
    }
}