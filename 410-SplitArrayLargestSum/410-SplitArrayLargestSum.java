// Last updated: 7/15/2025, 3:22:49 PM
class Solution
{
    public int[] maxnsum(int[] nums)
    {
        int max = nums[0];
        int sum = 0;
        for(int i = 0;i < nums.length;i++)
        {
            sum += nums[i];
            max = Math.max(max,nums[i]);
        }
        return new int[]{max,sum};
    }
    public int splitArray(int[] nums, int k)
    {
        int[] maxnsum = maxnsum(nums);
        int s = maxnsum[0];
        int e = maxnsum[1];
        while(s < e)
        {
            int m = s+(e-s)/2;
            int pieces = 1;
            int sum = 0;
            for(int num : nums)
            {
                if(sum+num > m)
                {
                    pieces++;
                    sum = num;
                }
                else
                    sum+=num;
            }
            if(pieces <= k)
                e = m;
            else
                s = m+1;
        }
        return s;
    }
}