// Last updated: 12/08/2026, 12:02:22
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int count = 0;
       for(char c : jewels.toCharArray()){
        for(char d : stones.toCharArray()){
            if(c == d){
                count++;
            }
        }
       } 
       return count;
    }
}