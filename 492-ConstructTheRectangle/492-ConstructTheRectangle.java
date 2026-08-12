// Last updated: 12/08/2026, 12:07:49
class Solution {
    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        for(int i =(int)Math.sqrt(area);i>=1;i--){
            if(area%i == 0){
                arr[1] = i;
                arr[0] = area/i;
                break;
            }
        }
       return arr; 
    }
}