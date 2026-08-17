// Last updated: 17/08/2026, 19:11:38
1class Solution {
2    public int stoneGameV(int[] stoneValue) {
3        int n = stoneValue.length;
4
5        long[] prefix = new long[n + 1];
6
7        for (int i = 0; i < n; i++) {
8            prefix[i + 1] = prefix[i] + stoneValue[i];
9        }
10
11        int[][] dp = new int[n][n];
12
13        int[][] leftBest = new int[n][n];
14
15        int[][] rightBest = new int[n][n];
16
17        int[] leftPtr = new int[n];
18
19        int[] rightPtr = new int[n];
20
21        for (int i = 0; i < n; i++) {
22            leftBest[i][i] = stoneValue[i];
23            rightBest[i][i] = stoneValue[i];
24
25            leftPtr[i] = i - 1;
26
27            rightPtr[i] = i;
28        }
29
30        for (int len = 2; len <= n; len++) {
31            for (int l = 0; l + len <= n; l++) {
32                int r = l + len - 1;
33
34                long total = prefix[r + 1] - prefix[l];
35
36                while (leftPtr[l] + 1 <= r - 1) {
37                    int k = leftPtr[l] + 1;
38                    long leftSum = prefix[k + 1] - prefix[l];
39
40                    if (2 * leftSum > total) {
41                        break;
42                    }
43
44                    leftPtr[l]++;
45                }
46
47                while (rightPtr[l] <= r - 1) {
48                    int k = rightPtr[l];
49                    long leftSum = prefix[k + 1] - prefix[l];
50
51                    if (2 * leftSum >= total) {
52                        break;
53                    }
54
55                    rightPtr[l]++;
56                }
57
58                int best = 0;
59
60                if (leftPtr[l] >= l) {
61                    best = leftBest[l][leftPtr[l]];
62                }
63
64                if (rightPtr[l] <= r - 1) {
65                    best = Math.max(best, rightBest[rightPtr[l] + 1][r]);
66                }
67
68                dp[l][r] = best;
69
70                leftBest[l][r] = Math.max(
71                    leftBest[l][r - 1],
72                    dp[l][r] + (int) total
73                );
74
75                rightBest[l][r] = Math.max(
76                    rightBest[l + 1][r],
77                    dp[l][r] + (int) total
78                );
79            }
80        }
81
82        return dp[0][n - 1];
83    }
84}