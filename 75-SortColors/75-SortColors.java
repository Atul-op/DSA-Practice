// Last updated: 10/08/2026, 16:18:10
class Solution {
    public void sortColors(int[] nums)
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int num : nums)
            map.replace(num , map.get(num)+1);
        int index = 0;
        for(int i = 0;i < map.get(0);i++)
            nums[index++] = 0;
        for(int i = 0;i < map.get(1);i++)
            nums[index++] = 1;
        for(int i = 0;i < map.get(2);i++)
            nums[index++] = 2;
    }
}