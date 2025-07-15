// Last updated: 7/15/2025, 3:23:39 PM
class Solution
{
    void swap(int[] arr , int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public int firstMissingPositive(int[] nums)
    {
        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] > nums.length || nums[i] < 1 || nums[nums[i]-1] == nums[i])
                i++;
            else
                swap(nums , i , nums[i] - 1);
        }
        for(i = 0;i < nums.length;i++)
            if(nums[i] != i+1)
                return i+1;
        return nums.length+1;
    }
}