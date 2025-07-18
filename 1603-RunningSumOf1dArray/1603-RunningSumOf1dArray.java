// Last updated: 7/15/2025, 3:22:01 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            ans[i] = sum + nums[i];
            sum = ans[i];
        }
        return ans;
    }
}