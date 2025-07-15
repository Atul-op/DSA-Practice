// Last updated: 7/15/2025, 3:22:24 PM
class Solution
{
    public boolean present(int[] arr,int target)
    {
        int s = 0;
        int e = arr.length-1;
        while(s <= e)
        {
            int m = s+(e-s)/2;
            if(arr[m] == target)
                return true;
            if(arr[m] > target)
                e = m-1;
            else
                s = m+1;
        }
        return false;
    }
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes)
    {
        //Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int alice = 0;
        int bob = 0;
        int sizeA = aliceSizes.length;
        int sizeB = bobSizes.length;
        // for (int i = 0; i < aliceSizes.length; i++)
        //     alice += aliceSizes[i];
        // for (int i = 0; i < bobSizes.length; i++)
        //     bob += bobSizes[i];
        for(int i = 0;i < Math.min(sizeA,sizeB);i++)
        {
            alice += aliceSizes[i];
            bob += bobSizes[i];
        }
        if(sizeA > sizeB)
            for(int i = sizeB;i < sizeA;i++)
                alice += aliceSizes[i];
        else if(sizeA < sizeB)
            for(int i = sizeA;i < sizeB;i++)
                bob += bobSizes[i];
        int diff = alice - bob;
        for(int box : aliceSizes)
        {
            if(present(bobSizes,box-diff/2))
                return new int[]{box,box-diff/2};
        }
        return new int[]{-1,-1};
    }
}