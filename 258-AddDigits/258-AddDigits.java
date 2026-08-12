// Last updated: 12/08/2026, 12:13:56
class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int res = 0;
             while(num != 0){
                res += num%10;
                num = num/10;   
    }
    num = res;
    }
    return num;
    }
}