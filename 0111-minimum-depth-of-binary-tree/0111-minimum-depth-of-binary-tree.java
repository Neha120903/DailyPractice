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
    public int minDepth(TreeNode root) {
        return helper(root);
    }
    public int helper(TreeNode curr)
    {
        if(curr==null) return 0;
        int l=helper(curr.left);
        int r=helper(curr.right);
        return (l==0 || r==0) ? l+r+1: Math.min(l,r)+1;
    }
}