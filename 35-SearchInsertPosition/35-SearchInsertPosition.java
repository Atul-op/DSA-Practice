// Last updated: 7/15/2025, 3:23:45 PM
class Solution {
    public int searchInsert(int[] nums, int target)
    {
        int s = 0;
        int e = nums.length-1;
        while(s <= e)
        {
            int m = s+(e-s)/2;
            if(nums[m] == target)
                return m;
            if(nums[m] > target)
                e = m-1;
            else
                s = m+1;
        }
        return s;
    }
}