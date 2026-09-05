// Last updated: 05/09/2026, 06:15:25
1class Solution
2{
3    public int firstStableIndex(int[] nums, int k)
4    {
5        if(nums.length == 1)
6            return 0;
7        int[] min = new int[nums.length];
8        int[] max = new int[nums.length];
9        max[0] = nums[0];
10        min[nums.length-1] = nums[nums.length-1];
11        for(int i = 1;i < nums.length;i++)
12        {
13            max[i] = Math.max(max[i-1],nums[i]);
14            min[nums.length-i-1] = Math.min(min[nums.length-i],nums[nums.length-i-1]);
15        }
16        for(int i = 0;i < nums.length;i++)
17            if(max[i]-min[i] <= k)
18                return i;
19        return -1;
20    }
21}