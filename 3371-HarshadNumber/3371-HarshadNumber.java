// Last updated: 12/08/2026, 11:52:40
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
       int sum =0;
       int ori = x;
       while(x > 0){
        int di = x % 10;
        sum += di;
        x /= 10;
       }
       if( sum != 0 && ori%sum == 0){
        return sum;
       }
       else{
        return -1;
       }
    }
}