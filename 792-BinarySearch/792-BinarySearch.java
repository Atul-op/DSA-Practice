// Last updated: 7/15/2025, 3:22:34 PM
class Solution
{
    int bSearch(int[] nums , int target , int s , int e)
    {
        if(s > e)
            return -1;
        int m = s+(e-s)/2;
        if(nums[m] == target)
            return m;
        if(nums[m] > target)
            return bSearch(nums , target , s , m-1);
        else
            return bSearch(nums , target , m+1 , e);
    }
    public int search(int[] nums, int target)
    {
        return bSearch(nums , target , 0 , nums.length-1);
    }
}