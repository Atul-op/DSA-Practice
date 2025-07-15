// Last updated: 7/15/2025, 3:23:29 PM
class Solution
{
    int getPos(char[][] board , char nextChar , int r , int c)
    {
        int ans = 0;
        if(r-1 >= 0 && board[r-1][c] == nextChar)
            ans = 1;
        if(c+1 < board[0].length && board[r][c+1] == nextChar)
            ans = ans*10 + 2;
        if(r+1 < board.length && board[r+1][c] == nextChar)
            ans = ans*10 + 3;
        if(c-1 >= 0 && board[r][c-1] == nextChar)
            ans = ans*10 + 4;
        return ans;
    }
    boolean helper(char[][] board , String word , int r , int c)
    {
        if(word.isEmpty())
            return true;
        int nextPos = getPos(board , word.charAt(0) , r , c); //0 = none , 1=up,2=right,3=down,4=left , can have multiple ways
        while(nextPos > 0)
        {
            char temp = board[r][c];
            board[r][c] = '.';
            if(switch(nextPos%10)
            {
                case 1 -> helper(board , word.substring(1) , r-1,c);
                case 2 -> helper(board , word.substring(1) , r,c+1);
                case 3 -> helper(board , word.substring(1) , r+1,c);
                case 4 -> helper(board , word.substring(1) , r,c-1);
                default -> false;
            })
                return true;
            board[r][c] = temp;    
            nextPos /= 10;
        }
        return false;
    }
    public boolean exist(char[][] board, String word)
    {
        for(int r = 0;r < board.length;r++)
            for(int c = 0;c < board[0].length;c++)
                if(board[r][c] == word.charAt(0))
                    if(helper(board , word.substring(1) , r , c))
                        return true;
        return false;
    }
}