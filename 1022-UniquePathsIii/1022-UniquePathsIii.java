// Last updated: 7/15/2025, 3:22:21 PM
class Solution
{
    boolean fullyFilled(int[][] grid)
    {
        for(int[] row : grid)
            for(int element : row)
                if(element == 0)
                    return false;
        return true;
    }
    int helper(int[][] grid, int r , int c)
    {
        if(grid[r][c] == 2)
        {
            if(fullyFilled(grid))
                return 1;
            return 0;
        }
        int count = 0;
        grid[r][c] = -1;
        //Right
        if(c+1 < grid[0].length && grid[r][c+1] != -1)
            count += helper(grid , r , c+1);
        //Down
        if(r+1 < grid.length && grid[r+1][c] != -1)
            count += helper(grid , r+1 , c);
        //Left
        if(c-1 >= 0 && grid[r][c-1] != -1)
            count += helper(grid , r , c-1);
        //Up
        if(r-1 >= 0 && grid[r-1][c] != -1)
            count += helper(grid , r-1 , c);
        grid[r][c] = 0;
        return count;
    }
    public int uniquePathsIII(int[][] grid)
    {
        int i = 0,j = 0;
        for(;i < grid.length;i++)
        {
            for(j = 0;j < grid[0].length;j++)
                if(grid[i][j] == 1)
                    break;
            if(j != grid[0].length)
                break;
        }
        return helper(grid , i , j);
    }
}