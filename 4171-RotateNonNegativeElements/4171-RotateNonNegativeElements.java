// Last updated: 10/08/2026, 16:12:58
class Solution
{
    public int[] rotateElements(int[] nums, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] negPos = new boolean[nums.length];

        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] < 0)
                negPos[i] = true;
            else
                list.add(nums[i]);
        }
        int length = list.size();

        if(length == 0)
            return nums;
        k = k%length;

        for(int i = 0;i < (length+1)/2;i++)
        {
            int temp = list.get(i);
            list.set(i , list.get(length-i-1));
            list.set(length-i-1 , temp);
        }

        for(int i = 0;i < (length-k+1)/2;i++)
        {
            int temp = list.get(i);
            list.set(i , list.get(length-k-i-1));
            list.set(length-k-i-1 , temp);
        }

        for(int i = 0;i < (k+1)/2;i++)
        {
            int temp = list.get(length-k+i);
            list.set(length-k+i , list.get(length-i-1));
            list.set(length-i-1 , temp);
        }

        int pointer = 0;
        for(int i = 0;i < nums.length;i++)
            if(!negPos[i])
                nums[i] = list.get(pointer++);

        return nums;
    }
}