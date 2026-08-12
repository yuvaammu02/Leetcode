// Last updated: 12/08/2026, 12:01:11
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
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        collectleaf(root1,l1);
        collectleaf(root2,l2);
        return l1.equals(l2);
    }
    private void collectleaf(TreeNode root,List<Integer> l){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            l.add(root.val);
        }
        collectleaf(root.left,l);
        collectleaf(root.right,l);
    }
}