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
    public TreeNode sortedArrayToBST(int[] nums) {
       if(nums.length == 0)
           return null;
        TreeNode root = helperMethod(nums,0,nums.length-1);
        return root;
    }
    
    public TreeNode helperMethod(int nums[], int low, int high)
    {
        if(low > high)
        {
            return null;
        }
        int mid = (high + low)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helperMethod(nums,low,mid-1);
        node.right = helperMethod(nums,mid+1,high);
        return node;
    }
}