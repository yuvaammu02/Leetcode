// Last updated: 12/08/2026, 11:53:03
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Long> map = new HashMap<>();
        long prefixSum = 0;
        long maxSum = Long.MIN_VALUE;
        for (int num : nums) {
            prefixSum += num;
            if (map.containsKey(num - k)) {
                maxSum = Math.max(maxSum, prefixSum - map.get(num - k));
            }
            if (map.containsKey(num + k)) {
                maxSum = Math.max(maxSum, prefixSum - map.get(num + k));
            }
            long previousPrefix = prefixSum - num;
            if (!map.containsKey(num) || previousPrefix < map.get(num)) {
                map.put(num, previousPrefix);
            }
        }
        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}