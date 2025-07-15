// Last updated: 7/15/2025, 3:22:06 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length;i++)
            list.add(index[i],nums[i]);
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length;i++)
            ans[i] = list.get(i);
        return ans;
    }
}