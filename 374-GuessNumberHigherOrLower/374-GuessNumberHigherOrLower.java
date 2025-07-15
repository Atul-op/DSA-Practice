// Last updated: 7/15/2025, 3:22:50 PM
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame
{
    public int guessNumber(int n)
    {
        int s = 1;
        int e = n;
        while(s <= e)
        {
            int num = s+(e-s)/2;
            if(guess(num) == 0)
                return num;
            if(guess(num) == -1)
                e = num-1;
            else
                s = num+1;
        }
        return -1;
    }
}