// Last updated: 7/15/2025, 3:22:53 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2)
    {
        int[] freq = new int[1001];
        for(int i = 0;i < nums1.length;i++)
            freq[nums1[i]]++;
        //boolean[] exist = new boolean[1001];
        int[] ans = new int[Math.min(nums1.length,nums2.length)];
        int index = 0;
        for(int i = 0;i < nums2.length;i++)
            if(freq[nums2[i]] > 0)
            {
                ans[index++] = nums2[i];
                freq[nums2[i]]--;
            }
        return Arrays.copyOf(ans,index);
    }
}