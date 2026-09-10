// Last updated: 11/09/2026, 04:47:01
1class Solution
2{
3    public boolean uniformArray(int[] nums1)
4    {
5        int MAX = 1_000_000_001;
6        int minOdd = MAX;
7        int minEven = MAX;
8        for(int num : nums1)
9        {
10            if((num&1) == 0)
11                minEven = Math.min(num,minEven);
12            else
13                minOdd = Math.min(num,minOdd);
14        }
15        if(minOdd == MAX || minEven == MAX)
16            return true;
17        return minOdd<minEven;
18    }
19}