// Last updated: 7/15/2025, 3:22:10 PM
class Solution
{
    public boolean checkIfExist(int[] arr)
    {
        if(arr.length < 2)
            return false;
        //Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0;j < arr.length;j++)
            {
                if(arr[i] == arr[j]*2 && i!=j)
                    return true;
            }
            // int s = 0;
            // int e = arr.length-1;
            // while(s <= e)
            // {
            //     int m = s+(e-s)/2;
            //     if(arr[m] == arr[i]*2 && i!=m)
            //         return true;
            //     if(arr[m] > arr[i]*2)
            //         e = m-1;
            //     else
            //         s = m+1;
            // }
        }
        return false;
    }
}