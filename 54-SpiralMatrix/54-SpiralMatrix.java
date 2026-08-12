// Last updated: 12/08/2026, 12:23:57
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> list = new ArrayList<>();
      if(matrix == null || matrix.length == 0) return list;  
      int t = 0;
      int b = matrix.length-1;
      int l = 0;
      int r = matrix[0].length-1;
      while(l <= r && t <= b){
        for(int j = l;j<=r;j++){
            list.add(matrix[t][j]);
        }
        t++;
        for(int i = t;i<=b;i++){
            list.add(matrix[i][r]);
        }
        r--;
        if(t <= b){
            for(int j = r;j>=l;j--){
                list.add(matrix[b][j]);
            }
            b--;
        }
        if(l <= r){
            for(int i = b;i>=t;i--){
                list.add(matrix[i][l]);
            }
            l++;
        }
      }
      return list; 
    }

}