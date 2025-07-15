// Last updated: 7/15/2025, 3:23:00 PM
class Solution
{
    public int findDuplicate(int[] nums)
    {
        int[] freq = new int[nums.length-1];
        for(int num : nums)
            if(++freq[num-1] > 1)
                return num;
        return 0;
    }
}