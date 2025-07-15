// Last updated: 7/15/2025, 3:22:47 PM
class Solution
{
    public int[] findRightInterval(int[][] intervals)
    {
        //getting min and max number in intervals
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < intervals.length;i++)
        {
            min = Math.min(min , intervals[i][0]);
            max = Math.max(max , intervals[i][1]);
        }
        int[] range = new int[max-min+1];
        Arrays.fill(range,-1);
        for(int i = 0;i < intervals.length;i++)
            range[intervals[i][0] - min] = i;
        for(int i = range.length-2;i >= 0;i--)
            if(range[i] == -1)
                range[i] = range[i + 1];
        int[] ans = new int[intervals.length];
        for(int i = 0;i < intervals.length;i++)
            ans[i] = range[intervals[i][1] - min];
        return ans;
    }
}