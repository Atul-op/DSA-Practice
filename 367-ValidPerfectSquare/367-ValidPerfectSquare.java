// Last updated: 7/15/2025, 3:22:51 PM
class Solution {
    public boolean isPerfectSquare(int num)
    {
        int s = 0;
        int e = num;
        while(s <= e)
        {
            int m = s+(e-s)/2;
            if((long)m*m == num)
                return true;
            if((long)m*m > num)
                e = m-1;
            else
                s = m+1;
        }
        return false;
    }
}