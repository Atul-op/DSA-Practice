// Last updated: 9/20/2025, 4:56:48 PM
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
    // boolean isSym(List<Integer> list)
    // {
    //     int l = list.size();
    //     for(int i = 0;i < l/2;i++)
    //     {
    //         if(list.get(i) != list.get(l-i-1))
    //             return false;
    //     }
    //     return true;
    // }
    public boolean isSymmetric(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            for(int i = 0;i < levelSize;i++)
            {
                TreeNode left = queue.poll();
                TreeNode right = queue.poll();
                if(left == null && right == null)
                    continue;
                else if(left == null || right == null)
                    return false;
                else if(left.val != right.val)
                    return false;
                queue.offer(left.left);
                queue.offer(right.right);
                queue.offer(left.right);
                queue.offer(right.left);
            }
        }
        return true;
    }
}