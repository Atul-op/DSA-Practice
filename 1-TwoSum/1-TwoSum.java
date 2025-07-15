// Last updated: 7/15/2025, 3:23:57 PM
class Solution
{
    int[] twoSum(int[] nums,int target)
    {
        int i,j=0;
        for(i = 0;i < nums.length;i++)
        {
            for(j = i+1;j < nums.length;j++)
                if(nums[i]+nums[j] == target)
                    break;
            if(j < nums.length)
                break;
        }
        int[] ret = {i,j};
        return ret;
    }
}