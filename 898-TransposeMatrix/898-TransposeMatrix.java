// Last updated: 12/08/2026, 12:01:20
class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] mat = new int[m][n];
        for(int r = 0;r < n;r++){
            for(int c =0;c <m;c++){
                mat[c][r] = matrix[r][c];
            }
        }
        return mat;
    }
}