// Last updated: 12/08/2026, 11:50:36
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        TreeSet<Integer> time = new TreeSet<>();
        for(int[] pa : series1){
            time.add(pa[0]);
        }
        for(int[] p:series2 ){
            time.add(p[0]);
        }
        List<List<Integer>> res = new ArrayList<>();
        int i =0;
        int j =0;
        for(int t : time){
            while(i < series1.length && series1[i][0] < t){
                i++;
            }
            int v = (i < series1.length) ? series1[i][1] : 0;
            while(j < series2.length && series2[j][0] < t){
                j++;
            }
            int v1 = (j < series2.length)? series2[j][1] :0;
            res.add(Arrays.asList(t,v+v1));
        }
        return res;
    }
}