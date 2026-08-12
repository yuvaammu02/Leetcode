// Last updated: 12/08/2026, 12:00:26
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : deck){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        int gcd = 0;
        for(int count : map.values()){
            if(count == 0){
                gcd = count;
            }
            else{
               int  a = gcd;
               int b  = count;
               while(b != 0){
                  int temp = b;
                  b = a%b;
                  a = temp;
               }
                gcd = a;
            }
        }
        return gcd >=2;
    }
}