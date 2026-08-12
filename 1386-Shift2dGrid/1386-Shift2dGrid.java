// Last updated: 12/08/2026, 11:57:12
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] changed = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                int curr = i*n+j;
                int newe = (curr+k)%(m*n);
                int r = newe/n;
                int c = newe%n;
                changed[r][c] = grid[i][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<m;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j =0;j<n;j++){
                temp.add(changed[i][j]);
            }
            res.add(temp);
        }
        return res;
    }
}