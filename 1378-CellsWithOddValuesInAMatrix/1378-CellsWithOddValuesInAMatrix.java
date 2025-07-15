// Last updated: 7/15/2025, 3:22:16 PM
class Solution {
    public int oddCells(int m, int n, int[][] indices)
    {
        int odd = 0;
        int[][] mat = new int[m][n];
        for(int[] row : mat)
            for(int num : row)
                num = 0;
        for(int[] ind : indices)
        {
            for(int i = 0;i < n;i++)
                mat[ind[0]][i]++;
            for(int[] row : mat)
                row[ind[1]]++;
        }
        for(int[] row : mat)
            for(int i : row)
                if(i % 2 != 0)
                    odd++;
        return odd;
    }
}