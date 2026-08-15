// Last updated: 15/08/2026, 18:09:01
1class Solution {
2    public int longestSubsequence(int[] A) {
3        int tot = 0, n = A.length;
4        boolean nonZero = false;
5        for (int x : A) {
6            nonZero |= x > 0;
7            tot ^= x;
8        }
9        if (!nonZero) return 0;
10        return tot == 0 ? n - 1 : n;
11    }
12}