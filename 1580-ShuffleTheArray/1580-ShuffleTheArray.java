// Last updated: 7/15/2025, 3:22:02 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0;i < 2*n;i++)
        {
            if(i % 2 == 0)
            {
                ans[i] = nums[i/2];
            }
            else
            {
                ans[i] = nums[n + ((i-1)/2)];
            }
        }
        return ans;
    }
}