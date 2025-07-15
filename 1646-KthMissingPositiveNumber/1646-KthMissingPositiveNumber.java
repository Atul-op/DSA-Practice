// Last updated: 7/15/2025, 3:21:58 PM
class Solution {
    public int findKthPositive(int[] arr, int k)
    {
        for(int num : arr)
        {
            if(num <= k)
                k++;
            else
                return k;    
        }
        return k;
    }
}