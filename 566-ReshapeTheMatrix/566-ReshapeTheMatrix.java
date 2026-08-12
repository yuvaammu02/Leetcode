// Last updated: 12/08/2026, 12:06:04
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ro = mat.length;
        int co = mat[0].length;
        if((ro*co) != (r*c)){
            return mat;
        }
        int[][] res = new int[r][c];
        int or =0;
        int oc =0;
        for(int i =0;i<ro;i++){
            for(int j =0;j<co;j++){
                res[or][oc] = mat[i][j];
                oc++;
                if(oc == c){
                    oc =0;
                    or++;
                }
            }
        }
        return res;
    }
}