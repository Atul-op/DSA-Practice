// Last updated: 7/15/2025, 3:21:56 PM
class Solution
{
    public char findKthBit(int n, int k)
    {
        if(n == 1)
            return '0';
        int size = 1<<n; //1 greater than the actual
        if(k == size/2)
            return '1';
        if(k < size/2)
            return findKthBit(n-1 , k);
        return (findKthBit(n-1,size-k) == '0' ? '1':'0');
    }
}