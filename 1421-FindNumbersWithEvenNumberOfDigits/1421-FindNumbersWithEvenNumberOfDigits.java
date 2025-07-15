// Last updated: 7/15/2025, 3:22:15 PM
class Solution {
    public int findNumbers(int[] nums)
    {
        int ans = 0;
        for(int num : nums)
            if((int)(Math.log10(num)+1) % 2 == 0)
                ans++;
        return ans;
    }
}