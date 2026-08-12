// Last updated: 12/08/2026, 11:51:36
class Solution {
    public int gcdOfOddEvenSums(int n) {
        long num = n;
        long os = num*num;
        long es = num *(num+1);
        long a = os;
        long b = es;
        while(b !=0){
           long temp = b;
            b = a%b;
            a = temp;
        }
        return (int) Math.abs(a);
    }
}