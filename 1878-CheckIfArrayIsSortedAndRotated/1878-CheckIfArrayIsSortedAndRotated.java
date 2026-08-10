// Last updated: 10/08/2026, 16:13:24
class Solution
{
    public boolean check(int[] nums)
    {
        boolean flag = false;
        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] > nums[(i+1)%nums.length])
            {
                if(flag)
                    return false;
                else
                    flag = true;
            }
        }
        return true;
    }
}