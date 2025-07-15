// Last updated: 7/15/2025, 3:23:18 PM
class Solution
{
    public static int pivotIndex(int[] nums)
    {
        int s = 0;
        int e = nums.length-1;
        while(s <= e)
        {
            int m = s+(e-s)/2;
            if((e>m)&&(nums[m] > nums[m+1]))
                return m;
            else if((s<m)&&(nums[m] < nums[m-1]))
                return m-1;
            else if(nums[s] >= nums[m])
                e = m-1;
            else
                s = m+1;
        }
        return nums.length-1;
    }
    public int findMin(int[] nums)
    {
        if(nums.length == 1)
            return nums[0];
        int pivot = pivotIndex(nums);
        return nums[(pivot+1)%(nums.length)];
    }
}