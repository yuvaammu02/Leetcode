// Last updated: 12/08/2026, 11:59:52
class Solution {
    public int fib(int n) {
        int prev = 0;
     int curr = 1;
     int next ;
    if(n <= 1){
     return n;
    }
    for(int i =2;i <= n;i++){
        next = prev + curr;
        prev = curr;
        curr = next;
    }
   return curr;
    }
}