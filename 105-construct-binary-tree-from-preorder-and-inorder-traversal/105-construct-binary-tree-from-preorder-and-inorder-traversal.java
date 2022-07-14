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
// In preorder traversal first we will be having the root of the whole tree
class Solution {
    
    int preorderIndex;  
    Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex  = 0;
        // build a hashmap to sore value -> its index relation
        inorderIndexMap = new HashMap<>();
        for(int i=0 ;i<inorder.length;i++)
            inorderIndexMap.put(inorder[i],i);
        
        return arrayToTree(preorder, 0, preorder.length-1);
    }
    
    public TreeNode arrayToTree(int[] preorder, int left, int right)
    {
        //If there are no elements to construct the tree
        if(left>right)
            return null;
        //select the preorderIndex element as the root
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        
        //Now we will build left and right subtree
        //excluding inorderIndexMap[rootvalue] element because it is the root
        root.left = arrayToTree(preorder, left, inorderIndexMap.get(rootValue)-1);
        root.right = arrayToTree(preorder,inorderIndexMap.get(rootValue)+1, right);
        return root;
    }
}