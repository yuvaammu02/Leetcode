// Last updated: 12/08/2026, 12:01:06
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(high,pile);
        }
        while(l < high){
            int mid = l + (high - l)/2;
            int hours =0;
        for(int pile : piles){
            hours += (pile + mid-1)/mid;
        }
        if(hours <= h){
           high = mid;
        }
        else{
            l = mid+1;
        }
        }
        return l;
    }
}