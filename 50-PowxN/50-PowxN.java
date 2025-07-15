// Last updated: 7/15/2025, 3:23:37 PM
class Solution
{
    public double myPow(double x, int n)
    {
        if(x == 1.0)
            return 1;
        long exp = n;
        if(exp < 0)
        {
            x = 1.0/x;
            exp = -exp;
        }
        double ans = 1.0;
        while(exp != 0)
        {
            if((exp&1) == 1)
                ans *= x;
            x *= x;
            exp>>=1;
        }
        return ans;
    }
}