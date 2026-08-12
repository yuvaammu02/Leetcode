// Last updated: 12/08/2026, 12:07:22
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    List<Integer> list = new ArrayList<>();
    TreeNode prev = null;
    int max = 0;
    int count = 0;
    public int[] findMode(TreeNode root) 
    {
        dfs(root);
        int n = list.size();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
    void dfs(TreeNode cur)
    {
        if(cur == null)
        {
            return;
        }
        dfs(cur.left);
        if(prev != null && prev.val == cur.val)
        {
            count++;
        }
        else
        {
            count = 1;
        }
        if(count > max)
        {
            list.clear();
            max = count;
            list.add(cur.val);
        }
        else if(count == max)
        {
            list.add(cur.val);
        }
        prev = cur;
        dfs(cur.right);
    }
}