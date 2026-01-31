// Last updated: 1/31/2026, 7:32:28 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target)
3    {
4        int start = 0;
5        int end = letters.length-1;
6        while(start <= end)
7        {
8            int mid = start + (end-start)/2;
9            if(target >= letters[mid])
10                start = mid+1;
11            else
12                end = mid-1;
13        }
14        System.gc();
15        return letters[start%letters.length];
16    }
17}