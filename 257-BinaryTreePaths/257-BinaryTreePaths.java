// Last updated: 10/08/2026, 16:16:12
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
    public List<String> helper(TreeNode root , String str)
    {
        List<String> list = new ArrayList<>();
        String curr = Integer.toString(root.val);
        if(root.left == null && root.right == null)
        {
            list.add(str+curr);
            return list;
        }
        if(root.left != null)
            list.addAll(helper(root.left,str+curr+"->"));
        if(root.right != null)
            list.addAll(helper(root.right,str+curr+"->"));
        return list;
    }
    public List<String> binaryTreePaths(TreeNode root)
    {
        return helper(root,"");
    }
}