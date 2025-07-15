// Last updated: 7/15/2025, 3:23:47 PM
class Solution {
    public int[] searchRange(int[] nums, int target)
    {
        if((nums.length == 0) || (target > nums[nums.length-1]))
            return new int[]{-1,-1};
        int[] ans = new int[2];
        int start = 0;
        int end = nums.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(target <= nums[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        if(target != nums[start])
            return new int[]{-1,-1};
        ans[0] = start;
        start = 0;
        end = nums.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(target >= nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        ans[1] = end;
        return ans;
    }
}