// Last updated: 7/15/2025, 3:21:47 PM
class Solution {
    public int largestAltitude(int[] gain)
    {
        int m = 0,currentAltitude = 0;
        for(int g : gain)
        {
            currentAltitude += g;
            m = Math.max(m,currentAltitude);
        }
        return m;
    }
}