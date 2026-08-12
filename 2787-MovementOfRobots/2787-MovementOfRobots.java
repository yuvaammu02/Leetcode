// Last updated: 12/08/2026, 11:53:39

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        
        int n = nums.length;
        long temp[] = new long[n];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R'){
                temp[i] = (long)nums[i] + d;
            }else{
                temp[i] = (long)nums[i] - d;
            }
        }

        Arrays.sort(temp);

        long res = 0;
        int j = n - 1;

        for (int i = 0; i < n; i++) {
            if (j - i <= 0) {
                break;
            }
            long diff = Math.abs(temp[j] - temp[i]);
            long prod = diff * (j - i);
            res += prod;
            res %= 1000000007;
            j--;
        }

        return (int) res;
    }
}