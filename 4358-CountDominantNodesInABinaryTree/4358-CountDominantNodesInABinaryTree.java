// Last updated: 12/08/2026, 11:49:53
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
    private int d =0;
    public int countDominantNodes(TreeNode root) {
        d =0;
        helper(root);
        return d;
    }
    private int helper(TreeNode node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int leftmax = helper(node.left);
        int rightmax = helper(node.right);
        int max = Math.max(node.val,Math.max(leftmax,rightmax));
        if(node.val == max){
            d++;
        }
        return max;
    }
}