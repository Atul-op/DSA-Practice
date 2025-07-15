// Last updated: 7/15/2025, 3:23:06 PM
class Solution
{
    // void swap(int[] nums, int s, int e)
    // {
    //     int temp = nums[s];
    //     nums[s] = nums[e];
    //     nums[e] = temp;
    // }
    public int missingNumber(int[] nums)
    {
        // int i = 0;
        // while(i < nums.length)
        // {
        //     if(nums[i] == i || nums[i] == nums.length)
        //         i++;
        //     else
        //         swap(nums, i , nums[i]);    
        // }
        // for(i = 0;i < nums.length;i++)
        //     if(nums[i] != i)
        //         return i;
        // return nums.length;
        int n = nums.length;
        int org = n*(n+1)/2;
        int sum = 0;
        for(int num : nums)
            sum += num;
        return org-sum;
    }
}