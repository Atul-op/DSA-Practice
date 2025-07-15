// Last updated: 7/15/2025, 3:22:40 PM
class Solution
{
    public int singleNonDuplicate(int[] nums)
    {
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 0)
            return -1;
        if(nums[0] != nums[1])
            return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2])
            return nums[nums.length-1];
        int s = 1;
        int e = nums.length-2;
        while(s <= e)
        {
            int m = s+(e-s)/2;
            if(nums[m] != nums[m+1] && nums[m] != nums[m-1])
                return nums[m];
            if((nums[m] == nums[m+1] && m%2 == 0)||(nums[m] == nums[m-1] && m%2 != 0))
                s = m+1;
            else
                e = m-1;
        }
        return -1;
    }
}