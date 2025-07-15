// Last updated: 7/15/2025, 3:23:56 PM
class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int index1 = -1;
        int index2 = -1;
        int midValue1 = -1;
        int midValue2 = -1;
        if(l1 != 0 && l2 != 0)
        {
            while(index1+index2 < (l1+l2-1)/2)
            {
                midValue1 = midValue2;
                if((index2+1 >= l2)||((index1+1 < l1)&&(nums1[index1+1] < nums2[index2+1])))
                {
                    index1++;
                    midValue2 = nums1[index1];
                }
                else
                {
                    index2++;
                    midValue2 = nums2[index2];
                }
            }
        }
        else
        {
            if(l1==0)
            {
                midValue1 = nums2[(l2-1)/2];
                midValue2 = nums2[(l2)/2];
            }
            else
            {
                midValue1 = nums1[(l1-1)/2];
                midValue2 = nums1[(l1)/2];
            }
        }
        
        if((l1+l2) % 2 == 0)
            return (midValue1+midValue2)/2.0;
        else
            return midValue1;
    }
}