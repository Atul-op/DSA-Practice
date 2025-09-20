// Last updated: 9/20/2025, 4:56:38 PM
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
    public void fill(Queue<TreeNode> queue , TreeNode root)
    {
        if(root == null)
            return;
        queue.offer(root);
        fill(queue,root.left);
        fill(queue , root.right);
        root.left = null;
        root.right = null;
    }
    public void flatten(TreeNode root)
    {
        if(root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        fill(queue , root);
        root.left = null;
        queue.poll();
        while(!queue.isEmpty())
        {
            root.right = queue.poll();
            root = root.right;
        }
    }
}