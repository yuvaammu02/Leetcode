// Last updated: 12/08/2026, 12:22:12
class Solution {
    public int numTrees(int n) {
        int tot = 0;
        if(n <=1) return 1;
        for(int i = 1;i<=n;i++){
            tot += numTrees(i-1) * numTrees(n-i);
        }
        return tot;
    }
}