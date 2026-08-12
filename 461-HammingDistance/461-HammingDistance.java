// Last updated: 12/08/2026, 12:08:25
class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        if(x == y){
            return count;
        }
        while(x > 0 || y > 0){
            int bitx = 0;
            int bity =0;
            if(x > 0){
                bitx = x%2;
                x = Math.floorDiv(x,2);
            }
            if(y > 0){
                bity = y%2;
                y = Math.floorDiv(y,2);
            }
            if(bitx != bity){
                count++;
            }
        }
            return count;

    }
}