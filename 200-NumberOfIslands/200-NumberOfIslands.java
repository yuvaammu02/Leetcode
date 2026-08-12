// Last updated: 12/08/2026, 12:16:29
class Solution {
    public int numIslands(char[][] grid) {
           int isl = 0;
        int m = grid.length; int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                     isl++;
                     dfs(grid, vis, i, j);
        }
    }
}
        return isl;
    }
    private void dfs(char[][] grid, boolean[][] vis, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length)
         return;

        if(grid[i][j] == '0') return;

        if(vis[i][j]) return;

        vis[i][j] = true;

        dfs(grid, vis, i-1,j);
        dfs(grid, vis, i+1,j);
        dfs(grid, vis, i,j-1);
        dfs(grid, vis, i,j+1);
    }
}