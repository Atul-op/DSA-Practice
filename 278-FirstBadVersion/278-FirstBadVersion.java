// Last updated: 7/15/2025, 3:23:01 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl
{
    public int firstBadVersion(int n)
    {
        int s = 1;
        int e = n;
        while(s <= e)
        {
            int version = s+(e-s)/2;
            if(isBadVersion(version))
                e = version-1;
            else
                s = version+1;
        }
        return s;
    }
}