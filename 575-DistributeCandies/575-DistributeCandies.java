// Last updated: 12/08/2026, 12:05:45
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int num : candyType){
            set.add(num);
        }
        int n = candyType.length/2;
        if(set.size() >= n){
            return n ;
        }
       return set.size(); 
    }
}