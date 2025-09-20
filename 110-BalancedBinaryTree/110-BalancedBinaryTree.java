// Last updated: 9/20/2025, 4:56:40 PM
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
    int height(TreeNode node)
    {
        if(node == null)
            return -1;
        return 1+Math.max(height(node.left) , height(node.right));
    }
    public boolean isBalanced(TreeNode root)
    {
        if(root == null)
            return true;
        int hD = height(root.left) - height(root.right);
        if(hD == 1 || hD == -1 || hD == 0)
            if(isBalanced(root.left) && isBalanced(root.right))
                return true;
        return false;
    }
}