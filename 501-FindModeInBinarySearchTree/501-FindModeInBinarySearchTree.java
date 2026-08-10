// Last updated: 10/08/2026, 16:15:15
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
    public void dfs(TreeNode root , int[] max , int[] count,TreeNode[] prev, ArrayList<Integer> ans)
    {
        if(root == null)
            return;
        dfs(root.left,max,count , prev , ans);
        if(prev[0] != null && prev[0].val == root.val)
            count[0]++;
        else
            count[0] = 1;
        prev[0] = root;
        if(count[0] > max[0])
            ans.clear();
        if(count[0] >= max[0])
        {
            ans.add(root.val);
            max[0] = count[0];
        }
        dfs(root.right,max , count ,prev , ans);
    }
    public int[] findMode(TreeNode root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, new int[1],new int[1],new TreeNode[1],ans);
        return ans.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}