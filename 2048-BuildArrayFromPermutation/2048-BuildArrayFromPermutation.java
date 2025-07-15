// Last updated: 7/15/2025, 3:21:44 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}