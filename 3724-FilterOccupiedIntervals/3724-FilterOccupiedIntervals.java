// Last updated: 12/08/2026, 11:52:14
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        List<List<Integer>> res = new ArrayList<>();
        if(occupiedIntervals.length == 0) return res;
        Arrays.sort(occupiedIntervals,(a,b) ->Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] cur = occupiedIntervals[0];
        for(int i =1;i<occupiedIntervals.length;i++){
            if(occupiedIntervals[i][0]<= cur[1] +1){
            cur[1] = Math.max(cur[1],occupiedIntervals[i][1]);
        } else{
                merged.add(cur);
                cur = occupiedIntervals[i];
        }
    }
        merged.add(cur);
        for(int[] in : merged){
            int s = in[0];
            int e = in[1];
            if(e < freeStart || s > freeEnd){
                res.add(Arrays.asList(s,e));
            } else{
                if(s < freeStart){
                    res.add(Arrays.asList(s,freeStart-1));
                }
                if(e > freeEnd){
                    res.add(Arrays.asList(freeEnd+1,e));
                }
            }
        }
        return res;
}
}