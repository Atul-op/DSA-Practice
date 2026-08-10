// Last updated: 10/08/2026, 16:16:02
class Solution {
    public void moveZeroes(int[] nums)
    {
        if(nums.length < 1)
            return;
        int i = 0;
        int j = 1;
        while(j<nums.length)
        {
            if(nums[i] == 0)
            {
                if(nums[j] == 0)
                    j++;
                else
                {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j++;
                }
            }
            else
            {
                i++;
                j++;
            }
        }
    }
}