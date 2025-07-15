// Last updated: 7/15/2025, 3:22:37 PM
class Solution
{
    public int[] findErrorNums(int[] nums)
    {
        int[] ans = new int[2];
        int[] freq = new int[nums.length];
        for(int num : nums)
            if(++freq[num-1] > 1)
                ans[0] = num;
        for(int i = 0;i < freq.length;i++)
            if(freq[i] == 0)
            {
                ans[1] = i+1;
                return ans;
            }
        return new int[]{};
    }
}