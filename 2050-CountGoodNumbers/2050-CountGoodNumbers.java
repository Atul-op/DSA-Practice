// Last updated: 10/08/2026, 16:13:14
class Solution
{
    final int MOD = 1_000_000_007;
    private long myPow(long x , long exp)
    {
        long res = 1;
        while(exp > 0)
        {
            if((exp&1)==1)
                res = (res*x)%MOD;
            x = (x*x)%MOD;
            exp>>=1;
        }
        return res;
    }
    public int countGoodNumbers(long n)
    {
        long evenDigits = (n+1)/2;
        long oddDigits = n/2;
        //5^even * 4^odd
        long first = myPow(5,evenDigits);
        long second = myPow(4,oddDigits);
        int ans = (int)((first*second)%MOD);
        return ans;
    }
}