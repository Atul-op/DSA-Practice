// Last updated: 10/08/2026, 16:16:41
class Solution
{
    public void reverse(int[] nums , int s , int e)
    {
        int len = e-s+1;
        for(int i = s;i <= s+(len/2)-1;i++)
        {
            int temp = nums[i];
            nums[i] = nums[e-i+s];
            nums[e-i+s] = temp;
        }
    }
    public void rotate(int[] nums, int k)
    {
        k = k%nums.length;
        reverse(nums , 0 , nums.length-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k ,nums.length-1);
    }
}