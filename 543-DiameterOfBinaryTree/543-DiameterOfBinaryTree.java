// Last updated: 9/20/2025, 4:56:13 PM
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
    int diameter = 0;
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int dia = leftHeight + rightHeight+1;
        diameter = Math.max(dia , diameter);
        return 1+Math.max(leftHeight , rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root)
    {
        height(root);
        return diameter-1;
    }
}