// Last updated: 7/15/2025, 3:22:13 PM
class Solution {
    public int[] sumZero(int n)
    {
        int[] arr = new int[n];
        int c = 0;
        if(n%2 != 0)
            arr[c++] = 0;
        for(int i = 1;i <= n/2;i++)
        {
            arr[c++] = i;
            arr[c++] = -i;
        }
        return arr;
    }
}