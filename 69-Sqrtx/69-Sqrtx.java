// Last updated: 7/15/2025, 3:23:32 PM
class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        while(s <= e)
        {
            int m = s+(e-s)/2;
            if((long)m*m == x)
            {
                System.gc();
                return m;
            }
            if((long)m*m > x)
                e = m-1;
            else
                s = m+1;        
        }
        System.gc();
        return e;
    }
}