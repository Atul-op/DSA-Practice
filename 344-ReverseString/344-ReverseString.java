// Last updated: 7/15/2025, 3:22:56 PM
class Solution
{
    public void reverseString(char[] s)
    {
        int n = s.length;
        for(int i = 0;i <= (n/2)-1;i++)
        {
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }
}