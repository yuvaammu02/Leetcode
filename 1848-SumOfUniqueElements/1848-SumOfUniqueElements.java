// Last updated: 12/08/2026, 11:55:06
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for(int num: nums){
            count[num]++;
        }
        int sum =0;
        for(int i =1;i<=100;i++){
            if(count[i]==1){
                sum += i;
            }
         }
         return sum;
    }
}