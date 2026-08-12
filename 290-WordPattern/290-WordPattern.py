# Last updated: 12/08/2026, 12:13:17
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()

        return (len(set(pattern)) ==
                len(set(s)) ==
                len(set(zip_longest(pattern,s))))