// Last updated: 7/15/2025, 3:23:40 PM
class Solution
{
    void helper(List<List<Integer>> outer , List<Integer> inner , int[] candidates, int target,int index , int sum)
    {
        if(sum >= target)
        {
            if(sum == target)
                outer.add(inner);
            return;
        }
        for(int i = index;i < candidates.length;i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(inner);
            sum += candidates[i];
            temp.add(candidates[i]);
            helper(outer , temp , candidates , target , i , sum);
            sum -= candidates[i];
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans , new ArrayList<>(), candidates , target, 0 , 0);
        return ans;
    }
}