// Last updated: 7/15/2025, 3:22:46 PM
class Solution
{
    public List<Integer> findDuplicates(int[] nums)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] freq = new int[nums.length];
        for(int num : nums)
            freq[num-1]++;
        for(int i = 0;i < freq.length;i++)
            if(freq[i] > 1)
                ans.add(i+1);
        return ans;
    }
}