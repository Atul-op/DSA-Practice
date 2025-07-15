// Last updated: 7/15/2025, 3:23:36 PM
class Solution
{
    boolean available(char[][] board , int r , int c)
    {
        for(int i = r;i >= 0;i--)
            if(board[i][c] == 'Q')
                return false;
        int i = r-1,j = c-1;
        while(i >= 0 && j >= 0)
        {
            if(board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        i = r-1;
        j = c+1;
        while(i >= 0 && j < board[0].length)
        {
            if(board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        return true;
    }
    List<String> giveSol(char[][] board)
    {
        List<String> sol = new ArrayList<>();
        for(char[] row : board)
            sol.add(new String(row));
        return sol;
    }
    void helper(List<List<String>> ans , char[][] board,int r)
    {
        if(r == board.length)
        {
            ans.add(giveSol(board));
            return;
        }
        for(int col = 0;col < board[0].length;col++)
        {
            if(available(board , r , col))
            {
                board[r][col] = 'Q';
                helper(ans , board, r+1);
                board[r][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n)
    {
        char[][] board = new char[n][n];
        for(int i = 0;i < board.length;i++)
            Arrays.fill(board[i],'.');
        List<List<String>> ans = new ArrayList<>();
        helper(ans , board , 0);
        return ans;
    }
}