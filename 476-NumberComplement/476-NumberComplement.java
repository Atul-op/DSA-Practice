// Last updated: 7/15/2025, 3:22:43 PM
class Solution
{
    int countBits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            num >>= 1;
            count++;
        }
        return count;
    }
    public int findComplement(int num)
    {
        int bits = countBits(num);
        return (((1<<bits)-1)-num);
    }
}