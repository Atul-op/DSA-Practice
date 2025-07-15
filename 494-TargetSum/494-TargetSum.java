// Last updated: 7/15/2025, 3:22:41 PM
class Solution
{
    int helper(int[] nums, int target , int sum , int index)
    {
        if(index == nums.length)
        {
            if(sum == target)
                return 1;
            else
                return 0;
        }
        int count = 0;
        count += helper(nums , target , sum+nums[index] , index+1);
        count += helper(nums , target , sum-nums[index] , index+1);
        return count;
    }
    public int findTargetSumWays(int[] nums, int target)
    {
        return helper(nums , target , 0 , 0);
    }
}