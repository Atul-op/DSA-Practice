// Last updated: 7/15/2025, 3:22:44 PM
class Solution 
{
    void swap(int[] arr , int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < nums.length)
        {
            if(nums[nums[i]-1] == nums[i])
                i++;
            else
                swap(nums , i , nums[i] - 1);
        }
        for(i = 0;i < nums.length;i++)
            if(nums[i] != i+1)
                ans.add(i+1);
        return ans;
    }
}