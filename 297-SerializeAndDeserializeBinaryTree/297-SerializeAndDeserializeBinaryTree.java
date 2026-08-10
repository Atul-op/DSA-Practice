// Last updated: 10/08/2026, 16:15:55
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    private void fillList(TreeNode root , List<String> list)
    {
        if(root == null)
        {
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.val));
        fillList(root.left , list);
        fillList(root.right , list);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root)
    {
        List<String> list = new ArrayList<>();
        fillList(root , list);
        return String.join(" ",list);
    }
    private List<String> toList(String str)
    {
        String[] arr = str.split(" ");
        for(int i = 1;i < arr.length;i++)
        {
            if(arr[i].charAt(0) == ' ')
                arr[i] = arr[i].substring(1,arr[i].length());
        }
        return new ArrayList<>(Arrays.asList(arr));
    }
    private TreeNode toTree(List<String> list)
    {
        String last = list.remove(list.size()-1);
        if(last.equals("null"))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(last));
        root.left = toTree(list);
        root.right = toTree(list);
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data)
    {
        List<String> list = toList(data);
        Collections.reverse(list);
        TreeNode root = toTree(list);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));