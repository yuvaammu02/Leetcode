# Last updated: 12/08/2026, 12:08:50
class Solution(object):
    def fourSumCount(self, A, B, C, D):
        AB = collections.Counter(a+b for a in A for b in B)
        return sum(AB[-c-d] for c in C for d in D)