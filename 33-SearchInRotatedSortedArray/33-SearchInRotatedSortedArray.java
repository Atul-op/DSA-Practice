// Last updated: 7/15/2025, 3:23:48 PM
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
    public static int binarySearch(int[] arr,int target,int start,int end)
    {
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public int search(int[] nums, int target)
    {
        if(nums.length == 1)
        {
            if(nums[0] == target)
                return 0;
            else
                return -1;
        }
        int pivot = pivotIndex(nums);
        if(nums[pivot] == target)
            return pivot;
        if(nums[0] <= target)
            return binarySearch(nums,target,0,pivot);
        else
            return binarySearch(nums,target,pivot+1,nums.length-1);
    }
}