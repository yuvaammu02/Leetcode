// Last updated: 12/08/2026, 11:54:05
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            int idx = m;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    idx = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            res[i] = m - idx;
        }
        return res;
    }
}