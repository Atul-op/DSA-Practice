// Last updated: 10/08/2026, 16:14:35
class Solution
{
    public boolean helper(int[] piles , boolean isAliceTurn , int s, int e , Boolean[][] dp , int alice , int bob)
    {
        if(s > e)
            return alice>bob;
        if(dp[s][e] != null)
            return dp[s][e];
        if(isAliceTurn)
        {
            if(helper(piles , false , s+1,e,dp, alice+piles[s],bob) || helper(piles , false , s,e-1,dp, alice+piles[e],bob))
                return dp[s][e] = true;
        }
        else
        {
            if(helper(piles , true , s+1,e,dp, alice,bob+piles[s]) || helper(piles , true , s,e-1,dp, alice,bob+piles[e]))
                return dp[s][e] = true;
        }
        return dp[s][e] = false;
    }
    public boolean stoneGame(int[] piles)
    {
        return helper(piles , true , 0,piles.length-1,new Boolean[piles.length][piles.length] , 0,0);
    }
}