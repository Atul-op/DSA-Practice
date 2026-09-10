// Last updated: 11/09/2026, 04:48:19
1class Solution
2{
3    public int firstStableIndex(int[] nums, int k)
4    {
5        if(nums.length == 1)
6            return 0;
7        int[] min = new int[nums.length];
8        int max = nums[0];
9        min[nums.length-1] = nums[nums.length-1];
10
11        for(int i = nums.length-2;i >= 0;i--)
12            min[i] = Math.min(min[i+1],nums[i]);
13
14        for(int i = 0;i < nums.length;i++)
15        {
16            if(max-min[i] <= k)
17                return i;
18            if(i < nums.length-1)
19                max = Math.max(max,nums[i+1]);
20        }
21        return -1;
22    }
23}