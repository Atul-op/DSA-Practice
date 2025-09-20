// Last updated: 9/20/2025, 4:56:01 PM
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
    int level(TreeNode root , int key ,int lev)
    {
        if(root == null)
            return 0;
        if(root.val == key)
            return lev;
        int l = level(root.left , key , lev+1);
        if(l != 0)
            return l;
        l = level(root.right , key , lev+1);
        return l;
    }
    boolean isSiblings(TreeNode root , int x , int y)
    {
        if(root == null)
            return false;
        return (
            (root.left != null && root.right != null &&((root.left.val == x && root.right.val == y) || (root.left.val == y && root.right.val == x))) || (isSiblings(root.left , x , y)) || (isSiblings(root.right , x , y))
        );
    }
    public boolean isCousins(TreeNode root, int x, int y)
    {
        return (level(root , x , 0) == level(root , y , 0) && !isSiblings(root , x , y));
    }
}