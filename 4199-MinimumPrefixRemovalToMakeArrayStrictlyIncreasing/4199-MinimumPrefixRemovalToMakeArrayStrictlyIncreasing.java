// Last updated: 10/08/2026, 16:12:54
class Solution
{
    public int minimumPrefixLength(int[] nums)
    {
        int res = -1;
        for(int i = 0;i < nums.length-1;i++)
        {
            if(nums[i] >= nums[i+1])
                res = i;
        }
        return res+1;
    }
}