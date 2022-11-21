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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al= new LinkedList<Integer>();
        Stack<TreeNode> s= new Stack<>();
        while(root!=null)
        {
            al.add(root.val);
            if(root.right!=null)
                s.push(root.right);
            if(root.left==null &&!s.isEmpty())
                root=s.pop();
            else
                root=root.left;
        }
        return al;
    }
}