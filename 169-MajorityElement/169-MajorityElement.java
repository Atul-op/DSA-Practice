// Last updated: 10/08/2026, 16:16:44
class Solution
{
    public int majorityElement(int[] nums)
    {
        if(nums.length == 1)
            return nums[0];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums)
        {
            Integer old = map.put(num , map.getOrDefault(num , 0)+1);
            if((old != null)&&(old+1 > nums.length/2))
                return num;
        }
        return 0;
    }
}