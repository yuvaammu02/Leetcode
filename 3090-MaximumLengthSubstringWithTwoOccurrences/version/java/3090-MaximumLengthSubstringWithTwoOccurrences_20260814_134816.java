// Last updated: 14/08/2026, 13:48:16
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int res = 0;
4        int[] fq = new int[26];
5        for (int l = 0, r = 0; r < s.length(); r++) {
6            fq[(s.charAt(r) & 31) - 1]++;
7            while (fq[(s.charAt(r) & 31) - 1] > 2)
8                fq[(s.charAt(l++) & 31) - 1]--;
9            res = Math.max(res, r - l + 1);
10        }
11        return res;
12    }
13}