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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ans = new ArrayList<Integer>();
       rightView(root, ans ,0);
        return ans;
    }
    
    public void rightView(TreeNode root, List<Integer> ans, int currDepth)
    {
        if(root == null)
            return ;
        if(currDepth == ans.size())
            ans.add(root.val);
        
        rightView(root.right, ans, currDepth+1);
        rightView(root.left , ans, currDepth+1);
            
    }
}