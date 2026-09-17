// Last updated: 17/09/2026, 08:54:49
1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3        int n = arr.length;
4        int[] best = new int[n];
5        java.util.Arrays.fill(best, Integer.MAX_VALUE);
6        int left = 0;
7        int sum = 0;
8        int answer = Integer.MAX_VALUE;
9        for (int right = 0; right < n; right++) {
10            sum += arr[right];
11            while (sum > target) {
12                sum -= arr[left];
13                left++;
14            }
15            if (sum == target) {
16                int currentLength = right - left + 1;
17                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
18                    answer = Math.min(
19                        answer,
20                        currentLength + best[left - 1]
21                    );
22                }
23                best[right] = currentLength;
24            }
25            if (right > 0) {
26                best[right] = Math.min(best[right], best[right - 1]);
27            }
28        }
29        return answer == Integer.MAX_VALUE ? -1 : answer;
30    }
31}