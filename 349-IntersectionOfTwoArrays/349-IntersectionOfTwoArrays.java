// Last updated: 7/15/2025, 3:22:54 PM
class Solution
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        boolean[] freq = new boolean[1001];
        for(int i = 0;i < nums1.length;i++)
            freq[nums1[i]] = true;
        boolean[] exist = new boolean[1001];
        int[] ans = new int[Math.min(nums1.length,nums2.length)];
        int index = 0;
        for(int i = 0;i < nums2.length;i++)
            if(freq[nums2[i]] && !exist[nums2[i]])
            {
                ans[index++] = nums2[i];
                exist[nums2[i]] = true;
            }
        return Arrays.copyOf(ans,index);
    }
}