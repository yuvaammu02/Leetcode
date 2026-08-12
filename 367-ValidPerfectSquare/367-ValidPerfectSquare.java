// Last updated: 12/08/2026, 12:11:19
class Solution {
    public boolean isPerfectSquare(int num) {
        long l =0;
        long r = num;
        while(l <= r){
            long m = (l + r)/2;
            if(m * m == num){
                return true;
            }
            else if(m *m < num){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return false;
    }
}