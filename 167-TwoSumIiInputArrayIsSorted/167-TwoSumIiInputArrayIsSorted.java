// Last updated: 7/15/2025, 3:23:15 PM
class Solution {
    public int[] twoSum(int[] numbers, int target)
    {
        int s = 0;
        int e = numbers.length-1;
        while(s <= e)
        {
            if(numbers[s] + numbers[e] == target)
                return new int[]{s+1,e+1};
            if(numbers[s] + numbers[e] > target)
                e--;
            else
                s++;
        }
        return new int[]{};
    }
}