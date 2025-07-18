// Last updated: 7/15/2025, 3:22:12 PM
class Solution
{
    public int numberOfSteps(int num)
    {
        if(num == 0)
            return 0;
        if(num % 2 == 0)
            return 1+numberOfSteps(num/2);
        return 1+numberOfSteps(num-1);
    }
}