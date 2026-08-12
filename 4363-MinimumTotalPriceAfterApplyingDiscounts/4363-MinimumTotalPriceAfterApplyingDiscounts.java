// Last updated: 12/08/2026, 11:49:40
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double s =0;
        int pt = prices.length-1;
        int dt = discounts.length-1;
        while(pt >=0 && dt >=0){
            double p = prices[pt];
            double d = discounts[dt];
            s += p *(100.0-d)/100.0;
            pt--;
            dt--;
        }
        while(pt >=0){
            s += prices[pt];
            pt--;
        }
        return s;
    }
}