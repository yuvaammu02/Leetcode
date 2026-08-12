// Last updated: 12/08/2026, 12:24:20
class Solution {
    public void rotate(int[][] matrix) {
        int[][] mat = new int[matrix.length][matrix.length];
        int a = 0;
        int b = 0;
        for(int i = matrix.length-1;i >= 0;i--){
            b = 0;
            for(int j = 0;j<matrix.length;j++){
                mat[b++][a] = matrix[i][j];
            }
            a++;
        }
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                matrix[i][j] = mat[i][j];
            }
        }
    }
}