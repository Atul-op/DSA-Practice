// Last updated: 7/15/2025, 3:22:26 PM
class Solution
{
    public int minEatingSpeed(int[] piles, int h)
    {
        int s = 1;
        int e = 0;
        for(int pile : piles)
            e = Math.max(e , pile);
        while(s <= e)
        {
            int m = s+(e-s)/2;
            int hours = 0;
            for(int pile : piles)
            {
                if(pile % m != 0)
                    hours += 1+pile/m;
                else
                    hours += pile/m;
            }
            if(hours < 0)
                hours = Integer.MAX_VALUE;
            if(hours <= h)
                e = m-1;
            else
                s = m+1;
        }
        return s;
    }
}