// Last updated: 7/15/2025, 3:22:07 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length;i++)
        {
            ans[i] = 0;
            for(int j = 0;j < nums.length;j++)
                if(nums[j] < nums[i])
                    ans[i]++;
        }
        return ans;
    }
}