// Last updated: 12/08/2026, 11:51:08
class Solution {
    public long[] minTimeMaxPower(int n, int[][] edges, int power, int[] cost, int source, int target) {
        List<int[]>[] adj = new ArrayList[n];
        for(int i =0;i<n;i++) adj[i] = new ArrayList<>();
        for(int[] e : edges){
            adj[e[0]].add(new int[]{e[1],e[2]});
        }
        long[][] min = new long[n][power+1];
        for(long[] row : min) {
            Arrays.fill(row,Long.MAX_VALUE);
        }
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b) ->{
            if(a[0] != b[0]) return Long.compare(a[0],b[0]);
            return Long.compare(b[1],a[1]);
        });
        min[source][power] = 0;
        pq.offer(new long[]{0,power,source});
        while(!pq.isEmpty()){
            long[] curr = pq.poll();
            long t = curr[0];
            int p = (int) curr[1];
            int u = (int) curr[2];
            if(u == target){
                return new  long[]{t,(long) p};
            }
            if(t > min[u][p]) continue;
            if(p >= cost[u]){
                int nextP =  p-cost[u];
                for(int[] edge : adj[u]){
                    int v = edge[0];
                    long nextT = t+ edge[1];
                    if(nextT <min[v][nextP]){
                        min[v][nextP] = nextT;
                        pq.offer(new long[]{nextT,(long) nextP,v});
                    }
                }
            }
        }
        return new long[]{-1,-1};
    }
}