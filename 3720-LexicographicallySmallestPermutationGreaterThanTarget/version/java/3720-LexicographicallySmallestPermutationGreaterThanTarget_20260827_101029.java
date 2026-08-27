// Last updated: 27/08/2026, 10:10:29
1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int[] cnt = new int[26];
4        for (char ch : s.toCharArray()) {
5            cnt[ch - 'a']++;
6        }
7        for (char ch : target.toCharArray()) {
8            cnt[ch - 'a']--;
9        }
10        for (int i = target.length() - 1; i >= 0; i--) {
11            int cur = target.charAt(i) - 'a';
12            cnt[cur]++;
13            boolean ok = true;
14            for (int x : cnt) {
15                if (x < 0) {
16                    ok = false;
17                    break;
18                }
19            }
20            if (!ok) continue;
21            int next = -1;
22            for (int c = cur + 1; c < 26; c++) {
23                if (cnt[c] > 0) {
24                    next = c;
25                    break;
26                }
27            }
28            if (next == -1) continue;
29            cnt[next]--;
30            StringBuilder ans = new StringBuilder(target.substring(0, i));
31            ans.append((char) ('a' + next));
32            for (int c = 0; c < 26; c++) {
33                while (cnt[c]-- > 0) {
34                    ans.append((char) ('a' + c));
35                }
36            }
37            return ans.toString();
38        }
39        return "";
40    }
41}