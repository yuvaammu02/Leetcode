// Last updated: 12/08/2026, 11:50:11
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        List<List<Integer>> a = new ArrayList<>();
        for(int i =0;i<n;i++){
            a.add(new ArrayList<>());
        }
        for(int i =1;i<n;i++){
            a.get(parent[i]).add(i);
        }
        int[] d = new int[n];
        int m = finddepths(0,1,a,d);
        long s =0;
        for(int i =0;i<n;i++){
            long w = (long) nums[i]*(m-d[i] +1);
            s += w;
        }
        return s;
    }
    private int finddepths(int u,int i,List<List<Integer>> a,int[] d){
        d[u] = i;
        int max = i;
        for(int v : a.get(u)){
            max = Math.max(max,finddepths(v,i+1,a,d));
        }
        return max;
    }
}