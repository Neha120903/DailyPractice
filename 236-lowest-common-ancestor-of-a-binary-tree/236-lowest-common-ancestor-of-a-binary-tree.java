/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode ans;
    
    public Solution()
    {
        //Variable to store LCA
        this.ans = null;
    }
    
    private boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q)
    {
        //if reached the end of a branch 
        if(currentNode == null)
            return false;
        
        //if left recursion returns true set left =1
        int left = this.recurseTree(currentNode.left,p,q) ? 1: 0;
        
        //right recursion
        int right  = this.recurseTree(currentNode.right,p,q) ? 1:0;
        
        //if current Node is one of p or q
        int mid = (currentNode == p || currentNode == q) ?1 :0;
        
        if(mid+left+right >=2)
            this.ans = currentNode;
        
        return (mid+left+right>0);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.recurseTree(root,p,q);
        return this.ans;
    }
}