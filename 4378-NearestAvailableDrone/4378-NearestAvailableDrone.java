// Last updated: 27/08/2026, 10:17:18
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int m = -1;
        int md = Integer.MAX_VALUE;
        int tx = target[0];
        int ty = target[1];
        for(int i =0;i<drones.length;i++){
            int dx = drones[i][0];
            int dy = drones[i][1];
            int r = drones[i][2];
            int d = Math.abs(dx-tx)+Math.abs(dy-ty);
            if(d <= r){
                if(d <md){
                    md = d;
                    m = i;
                }
            }
        }
        return m;
    }
}