// Last updated: 10/08/2026, 16:12:53
class Solution
{
    public int nonPositive(int[] nums,int k)
    {
        int res = 0;
        int upperLimit = k*k;
        for(int num : nums)
        {
            while(num > 0)
            {
                num -= k;
                res++;
                if(res > upperLimit)
                    return res;
            }
        }
        return res;
    }
    public int minimumK(int[] nums)
    {
        int start = 1;
        int end = 10;
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(nonPositive(nums , end) > end*end)
            {
                start = end+1;
                end = end*2;
            }
            else if(nonPositive(nums , mid) > mid*mid)
                start = mid+1;
            else
                end = mid-1;
        }
        return start;
    }
}