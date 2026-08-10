// Last updated: 10/08/2026, 16:12:51
class Solution
    {
    public List<Integer> findMissingElements(int[] nums)
    {
        
        HashSet<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = min;
        for(int num : nums)
        {
            min = Math.min(min,num);
            max = Math.max(max,num);
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = min;i <= max;i++)
        {
            if(!set.contains(i))
                list.add(i);
        }
        return list;
        
    }
}