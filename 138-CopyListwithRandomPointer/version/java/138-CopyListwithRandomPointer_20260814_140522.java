// Last updated: 14/08/2026, 14:05:22
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) {
4            return "";
5        }
6        Map<Character, Integer> charCount = new HashMap<>();
7        for (char ch : t.toCharArray()) {
8            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
9        }
10        int targetCharsRemaining = t.length();
11        int[] minWindow = {0, Integer.MAX_VALUE};
12        int startIndex = 0;
13        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
14            char ch = s.charAt(endIndex);
15            if (charCount.containsKey(ch) && charCount.get(ch) > 0) {
16                targetCharsRemaining--;
17            }
18            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
19            if (targetCharsRemaining == 0) {
20                while (true) {
21                    char charAtStart = s.charAt(startIndex);
22                    if (charCount.containsKey(charAtStart) && charCount.get(charAtStart) == 0) {
23                        break;
24                    }
25                    charCount.put(charAtStart, charCount.getOrDefault(charAtStart, 0) + 1);
26                    startIndex++;
27                }
28                if (endIndex - startIndex < minWindow[1] - minWindow[0]) {
29                    minWindow[0] = startIndex;
30                    minWindow[1] = endIndex;
31                }
32                charCount.put(s.charAt(startIndex), charCount.getOrDefault(s.charAt(startIndex), 0) + 1);
33                targetCharsRemaining++;
34                startIndex++;
35            }
36        }
37        return minWindow[1] >= s.length() ? "" : s.substring(minWindow[0], minWindow[1] + 1);        
38    }
39}