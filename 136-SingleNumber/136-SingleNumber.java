// Last updated: 10/08/2026, 16:17:17
class Solution
{
    public int singleNumber(int[] nums)
    {
        int sum1 = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
            sum1 += num;
        }
        Iterator<Integer> itr = set.iterator();
        int sum2 = 0;
        while(itr.hasNext())
            sum2 += itr.next();
        int ans = 2*sum2-sum1;
        return ans;
    }
}