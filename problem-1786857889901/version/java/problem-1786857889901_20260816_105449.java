// Last updated: 16/08/2026, 10:54:49
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int m = -1;
4        int md = Integer.MAX_VALUE;
5        int tx = target[0];
6        int ty = target[1];
7        for(int i =0;i<drones.length;i++){
8            int dx = drones[i][0];
9            int dy = drones[i][1];
10            int r = drones[i][2];
11            int d = Math.abs(dx-tx)+Math.abs(dy-ty);
12            if(d <= r){
13                if(d <md){
14                    md = d;
15                    m = i;
16                }
17            }
18        }
19        return m;
20    }
21}