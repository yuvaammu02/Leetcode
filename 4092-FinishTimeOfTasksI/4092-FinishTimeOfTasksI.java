// Last updated: 12/08/2026, 11:51:23
class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        List<Integer>[] adj = new ArrayList[n];
        for(int i =0;i<n;i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            adj[edge[0]].add(edge[1]);
        }
        return calculateFinishTime(0,adj,baseTime);
    }
    private long calculateFinishTime(int u,List<Integer>[] adj,int[] baseTime){
        if(adj[u].isEmpty()){
            return (long) baseTime[u];
        }
        long earliest = Long.MAX_VALUE;
        long latest = Long.MIN_VALUE;
        for(int v : adj[u]){
            long childFinishTime = calculateFinishTime(v,adj,baseTime);
            earliest = Math.min(earliest,childFinishTime);
            latest = Math.max(latest,childFinishTime);
        }
        long ownDuration = (latest - earliest)+ baseTime[u];
        return latest + ownDuration;
    }
}