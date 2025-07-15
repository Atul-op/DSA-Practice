// Last updated: 7/15/2025, 3:22:35 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target)
    {
        int start = 0;
        int end = letters.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(target >= letters[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        System.gc();
        return letters[start%letters.length];
    }
}