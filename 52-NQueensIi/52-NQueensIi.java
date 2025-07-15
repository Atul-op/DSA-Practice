// Last updated: 7/15/2025, 3:23:35 PM
class Solution
{
    boolean available(boolean[][] board , int r , int c)
    {
        for(int i = r;i >= 0;i--)
            if(board[i][c] == true)
                return false;
        int i = r-1,j = c-1;
        while(i >= 0 && j >= 0)
        {
            if(board[i][j] == true)
                return false;
            i--;
            j--;
        }
        i = r-1;
        j = c+1;
        while(i >= 0 && j < board[0].length)
        {
            if(board[i][j] == true)
                return false;
            i--;
            j++;
        }
        return true;
    }
    int put(boolean[][] board ,int r)
    {
        if(r == board.length)
        {
            return 1;
        }
        int count = 0;    
        for(int i = 0;i < board[0].length;i++)
        {
            if(available(board, r, i))
            {
                board[r][i] = true;
                count += put(board, r+1);
                board[r][i] = false;
            }
        }
        return count;
    }
    public int totalNQueens(int n)
    {
        return put(new boolean[n][n] , 0);
    }
}