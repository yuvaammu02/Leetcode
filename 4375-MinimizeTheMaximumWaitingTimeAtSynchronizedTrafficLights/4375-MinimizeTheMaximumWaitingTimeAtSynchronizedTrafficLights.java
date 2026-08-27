// Last updated: 27/08/2026, 10:17:20
class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int m = 0;
        for(int l : lights){
            m = Math.max(m,l);
        }
        int mp = 0;
        for(int t : arrivalTime){
            int r = t%period;
            if(r >= m){
                int w = period - r;
                mp = Math.max(mp,w);
            }
        }
        return mp;
    }
}