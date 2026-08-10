// Last updated: 10/08/2026, 16:15:22
class Solution
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int maxCount = 0;
        int currentCount = 0;
        for(int num : nums)
        {
            if(num == 0)
            {
                maxCount = Math.max(currentCount , maxCount);
                currentCount = 0;
            }
            else
                currentCount++;
        }
        maxCount = Math.max(currentCount , maxCount);
        return maxCount;
    }
}