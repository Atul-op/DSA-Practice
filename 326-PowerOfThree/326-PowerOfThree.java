// Last updated: 7/15/2025, 3:22:59 PM
class Solution {
    public boolean isPowerOfThree(int n)
    {
        if(n<=0)
            return false;
        while(n%3 == 0)
        {
            n /= 3;
        }
        return (n==1);
    }
}