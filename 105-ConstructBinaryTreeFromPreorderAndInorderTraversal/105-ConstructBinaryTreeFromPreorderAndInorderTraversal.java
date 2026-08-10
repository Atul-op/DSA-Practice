// Last updated: 10/08/2026, 16:17:45
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
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        if(preorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        int i;
        for(i = 0;i < inorder.length;i++)
            if(inorder[i] == preorder[0])
                break;
        int[] LeftPre = Arrays.copyOfRange(preorder , 1 , i+1);
        int[] LeftIn = Arrays.copyOfRange(inorder , 0 , i);
        int[] RightPre = Arrays.copyOfRange(preorder , i+1 , preorder.length);
        int[] RightIn = Arrays.copyOfRange(inorder , i+1 , inorder.length);
        root.left = buildTree(LeftPre , LeftIn);
        root.right = buildTree(RightPre , RightIn);
        return root;
    }
}