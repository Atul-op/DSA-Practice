// Last updated: 1/31/2026, 8:47:30 PM
1class Solution
2{
3    public int nonPositive(int[] nums,int k)
4    {
5        int res = 0;
6        int upperLimit = k*k;
7        for(int num : nums)
8        {
9            while(num > 0)
10            {
11                num -= k;
12                res++;
13                if(res > upperLimit)
14                    return res;
15            }
16        }
17        return res;
18    }
19    public int minimumK(int[] nums)
20    {
21        int start = 1;
22        int end = 10;
23        while(start <= end)
24        {
25            int mid = start+(end-start)/2;
26            if(nonPositive(nums , end) > end*end)
27            {
28                start = end+1;
29                end = end*2;
30            }
31            else if(nonPositive(nums , mid) > mid*mid)
32                start = mid+1;
33            else
34                end = mid-1;
35        }
36        return start;
37    }
38}