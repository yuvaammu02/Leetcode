// Last updated: 12/08/2026, 12:09:23
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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        return countpath(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
    public int countpath(TreeNode node,long target){
        if(node == null){
            return 0;
        }
        int c = 0;
        if(node.val == target){
            c++;
        }
        c += countpath(node.left,target-node.val);
        c += countpath(node.right,target-node.val);
        return c;
    }
}