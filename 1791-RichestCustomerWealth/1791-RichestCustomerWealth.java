// Last updated: 7/15/2025, 3:21:52 PM
class Solution {
    public int maximumWealth(int[][] accounts)
    {
        int max = 0;
        int sum;
        for(int i = 0;i < accounts.length;i++)
        {
            sum = 0;
            for(int j = 0;j < accounts[i].length;j++)
            {
                sum += accounts[i][j];
            }
            if(sum > max)
                max = sum;
        }
        return max;
    }
}