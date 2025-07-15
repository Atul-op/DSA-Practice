// Last updated: 7/15/2025, 3:22:19 PM
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution
{
    public static int peakIndexInMountainArray(MountainArray arr)
    {
        int start = 0;
        int end = arr.length() - 1;
        while(start < end)
        {
            int mid = (start+end)/2;
            if(arr.get(mid) > arr.get(mid+1))
                end = mid;
            else
                start = mid+1;
        }
        return start;
    }
    public static int binarySearch(MountainArray arr,int target,int start,int end,boolean isDes)
    {
        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(arr.get(mid) == target)
                return mid;
            else if((arr.get(mid) < target)^(isDes))
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr)
    {
        int peak = peakIndexInMountainArray(mountainArr);
        int pos = binarySearch(mountainArr,target,0,peak,false);
        if(pos == -1)
            pos = binarySearch(mountainArr,target,peak+1,mountainArr.length() - 1,true);
        return pos;
    }
}