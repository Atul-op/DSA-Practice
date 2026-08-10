// Last updated: 10/08/2026, 16:15:16
class Solution
{
    public int giveNextGreater(int[] nums2 , int index)
    {
        for(int i = index+1;i < nums2.length;i++)
            if(nums2[i] > nums2[index])
                return nums2[i];
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        int[] ans = new int[nums1.length];
        Map<Integer , Integer> indexMap = new HashMap<>();
        for(int i = 0;i < nums2.length;i++)
            indexMap.put(nums2[i] , i);
        for(int i = 0;i < ans.length;i++)
            ans[i] = giveNextGreater(nums2 , indexMap.get(nums1[i]));
        return ans;
    }
}