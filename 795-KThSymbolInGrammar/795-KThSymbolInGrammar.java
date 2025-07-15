// Last updated: 7/15/2025, 3:22:32 PM
class Solution
{
    public int kthGrammar(int n, int k) 
    {
        if(n == 1)
            return 0;
        int size = 1<<(n-1);
        if(k <= size/2)
            return kthGrammar(n-1 , k);
        else
            return 1^kthGrammar(n-1,k-size/2);
    }
}