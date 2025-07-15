// Last updated: 7/15/2025, 3:23:50 PM
class Solution
{
    // public static void shift(int[] nums,int i)
    // {
    //     for(;i < nums.length-1;i++)
    //     {
    //         int temp = nums[i];
    //         nums[i] = nums[i+1];
    //         nums[i+1] = temp;
    //     }
    // }
    public int removeDuplicates(int[] nums)
    {
        int i = 0;
        for(int j = 1;j < nums.length;j++)
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        // while(i < j)
        // {
        //     if(nums[i] == nums[i+1])
        //     {
        //         shift(nums,i+1);
        //         j--;
        //     }
        //     else
        //         i++;
        // }
        return (i+1);
    }
}