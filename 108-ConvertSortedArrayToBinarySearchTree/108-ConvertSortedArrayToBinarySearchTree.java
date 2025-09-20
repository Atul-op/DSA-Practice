// Last updated: 9/20/2025, 4:56:41 PM
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
    TreeNode insert(int[] nums , int start , int end)
    {
        if(start > end)
            return null;
        int mid = start+(end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = insert(nums , start , mid-1);
        node.right = insert(nums , mid+1 , end);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums)
    {
        return insert(nums , 0 , nums.length-1);
    }
}