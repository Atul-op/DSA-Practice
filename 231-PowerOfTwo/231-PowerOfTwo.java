// Last updated: 7/15/2025, 3:23:09 PM
class Solution
{
    public boolean isPowerOfTwo(int n)
    {
        return (n>0 && ((n&(n-1)) == 0));
    }
}