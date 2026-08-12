// Last updated: 12/08/2026, 11:49:37
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int ss = start[0]+start[1];
        int tar = target[0]+target[1];
        return (ss%2)== (tar%2);
    }
}