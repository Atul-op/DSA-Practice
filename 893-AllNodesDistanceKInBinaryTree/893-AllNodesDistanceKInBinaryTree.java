// Last updated: 10/08/2026, 16:14:44
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
    private int distance(TreeNode root , TreeNode target)
    {
        if(root == null)
            return -1;
        if(root == target)
            return 0;
        int leftAns = distance(root.left,target);
        if(leftAns != -1)
            return leftAns+1;
        int rightAns = distance(root.right,target);
        if(rightAns != -1)
            return rightAns+1;
        return -1;
    }
    private List<Integer> bfs(TreeNode root, int k)
    {
        List<Integer> ans = new ArrayList<>();
        if(k < 0 || root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty())
        {
            int len = queue.size();
            for(int i = 0;i < len;i++)
            {
                TreeNode curr = queue.poll();
                if(depth == k)
                    ans.add(curr.val);
                else
                {
                    if(curr.left != null)
                        queue.offer(curr.left);
                    if(curr.right != null)
                        queue.offer(curr.right);
                }
            }
            depth++;
        }
        return ans;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k)
    {
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        if(root == target)
            return bfs(root,k);
        int leftAns = distance(root.left,target);
        if(leftAns != -1)
        {
            if(k-leftAns-2 == -1)
                ans.add(root.val);
            ans.addAll(bfs(root.right,k-leftAns-2));
            ans.addAll(distanceK(root.left,target,k));
            return ans;
        }
        int rightAns = distance(root.right,target);
        if(rightAns != -1)
        {
            if(k-rightAns-2 == -1)
                ans.add(root.val);
            ans.addAll(bfs(root.left,k-rightAns-2));
            ans.addAll(distanceK(root.right,target,k));
            return ans;
        }
        return ans;
    }
}