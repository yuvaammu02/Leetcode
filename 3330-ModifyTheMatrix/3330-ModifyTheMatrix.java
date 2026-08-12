// Last updated: 12/08/2026, 11:52:43
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = getcolumn(matrix,j);
                }
            }
        }
        return matrix;
    }
    private int getcolumn(int[][] matrix,int col){
          int max = Integer.MIN_VALUE;
          for(int i =0;i<matrix.length;i++){
              if(matrix[i][col] > max){
                max = matrix[i][col];
              }
          }
          return max;
}
}