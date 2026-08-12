// Last updated: 12/08/2026, 11:50:31
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for(int i =0;i<m;i++){
            Arrays.fill(grid[i],'#');
        }
        for(int j =0;j<n;j++){
            grid[0][j] = '.';
        }
        for(int i =0;i<m;i++){
            grid[i][n-1] = '.';
        }
        List<String> res = new ArrayList<>();
        for(char[] row : grid){
            res.add(new String(row));
        }
        return res.toArray(new String[0]);
    }
}