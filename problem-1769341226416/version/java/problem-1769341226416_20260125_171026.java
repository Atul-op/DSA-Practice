// Last updated: 1/25/2026, 5:10:26 PM
1class Solution
2{
3    public int minimumPrefixLength(int[] nums)
4    {
5        int res = -1;
6        for(int i = 0;i < nums.length-1;i++)
7        {
8            if(nums[i] >= nums[i+1])
9                res = i;
10        }
11        return res+1;
12    }
13}