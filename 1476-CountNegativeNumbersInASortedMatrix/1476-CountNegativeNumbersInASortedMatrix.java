// Last updated: 7/15/2025, 3:22:09 PM
class Solution
{
    public int countNegatives(int[][] grid)
    {
        int r = 0;
        int c = grid[0].length-1;
        int count = 0;
        while(r < grid.length && c >= 0)
        {
            if(grid[r][c] <= -1)
            {
                count += grid.length-r;
                c--;
            }
            else
                r++;
        }
        return count;
    }
}