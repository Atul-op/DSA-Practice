// Last updated: 7/15/2025, 3:23:43 PM
class Solution
{
    static boolean available(char[][] board , int r , int c , char i)
    {
        for(int j = 0;j < board[0].length;j++)
        {
            if(board[r][j] == i)
                return false;
            if(board[j][c] == i)
                return false;    
        }
        for(int j = 0;j < 3;j++)
            for(int k = 0;k < 3;k++)
                if(board[r-(r%3)+j][c-(c%3)+k] == i)
                    return false;
        return true;
    }
    public static boolean solveSudoku(char[][] board)
    {
        int row = -1;
        int col = -1;
        boolean emptyElement = false;
        for(int i = 0;i < board.length;i++)
        {
            for(int j = 0;j < board[0].length;j++)
            {
                if(board[i][j] == '.')
                {
                    row = i;
                    col = j;
                    emptyElement = true;
                    break;
                }
            }
            if(emptyElement)
                break;
        } //we get the r and c of empty cell

        if(emptyElement == false)
            return true; // Sudoku Solved

        for(char i = '1';i <= '9';i++)
        {
            if(available(board, row, col, i))
            {
                board[row][col] = i;
                if(solveSudoku(board))
                    return true;
                else    
                    board[row][col] = '.';
            }
        }
        return false;
    }
}