// Last updated: 7/15/2025, 3:21:53 PM
class Solution
{
    public int count(int[] nums,int target)
    {
        int ans = 0;
        for(int num : nums)
            if(num >= target)
                ans++;
        return ans;
    }
    public int specialArray(int[] nums)
    {
        int s = 1;
        int e = nums.length;
        while(s <= e)
        {
            int m = s+(e-s)/2;
            int c = count(nums,m);
            if(m == c)
                return m;
            if(m > c)
                e = m-1;
            else
                s = m+1;
        }
        return -1;
    }
}