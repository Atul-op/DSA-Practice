// Last updated: 10/08/2026, 16:15:14
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
    public void helper(TreeNode root , TreeNode[] prev , int[] ans)
    {
        if(root == null)
            return;
        helper(root.left , prev , ans);
        if(prev[0] != null)
        {
            int curr = Math.abs(root.val-prev[0].val);
            if(ans[0] > curr)
                ans[0] = curr;
        }
        prev[0] = root;
        helper(root.right,prev, ans);
    }
    public int getMinimumDifference(TreeNode root)
    {
        int[] ans = {Integer.MAX_VALUE};
        helper(root , new TreeNode[1] , ans);
        return ans[0];
    }
}