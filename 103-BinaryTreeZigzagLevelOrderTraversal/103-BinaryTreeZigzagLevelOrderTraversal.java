// Last updated: 9/20/2025, 4:56:45 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerLast(root);
        boolean flow = true;
        while(!deque.isEmpty())
        {
            int levelSize = deque.size();
            List<Integer> curr = new ArrayList<>(levelSize);
            for(int i = 0;i < levelSize;i++)
            {
                if(flow)
                {
                    TreeNode node = deque.pollFirst();
                    if(node.left != null)
                        deque.offerLast(node.left);
                    if(node.right != null)
                        deque.offerLast(node.right);
                    curr.add(node.val);
                }
                else
                {
                    TreeNode node = deque.pollLast();
                    if(node.right != null)
                        deque.offerFirst(node.right);
                    if(node.left != null)
                        deque.offerFirst(node.left);
                    curr.add(node.val);
                }
            }
            result.add(curr);
            flow = !flow;
        }
        return result;
    }
}