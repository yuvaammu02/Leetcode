// Last updated: 12/08/2026, 12:09:50
class Solution {
    public int splitArray(int[] nums, int k) {
        int start = Integer.MIN_VALUE, end = 0;
        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int subarrays = 1, currSum = 0;
            for (int num : nums) {
                if (currSum + num > mid) {
                    subarrays++;
                    currSum = num;
                } else {
                    currSum += num;
                }
            }
            if (subarrays <= k) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}