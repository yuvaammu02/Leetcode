// Last updated: 17/08/2026, 19:12:41
1class Solution {
2    public boolean stoneGameIX(int[] stones) {
3        int a = 0;
4        int b = 0;
5        int c = 0;
6        for (int x : stones) {
7            if (x % 3 == 0) {
8                a++;
9            } else if (x % 3 == 1) {
10                b++;
11            } else {
12                c++;
13            }
14        }
15
16        if (a % 2 == 0) {
17            return b > 0 && c > 0;
18        }
19
20        return Math.abs(b - c) > 2;
21    }
22}