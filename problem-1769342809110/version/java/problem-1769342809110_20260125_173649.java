// Last updated: 1/25/2026, 5:36:49 PM
1class Solution
2{
3    public int[] rotateElements(int[] nums, int k)
4    {
5        ArrayList<Integer> list = new ArrayList<>();
6        boolean[] negPos = new boolean[nums.length];
7
8        for(int i = 0;i < nums.length;i++)
9        {
10            if(nums[i] < 0)
11                negPos[i] = true;
12            else
13                list.add(nums[i]);
14        }
15        int length = list.size();
16
17        if(length == 0)
18            return nums;
19        k = k%length;
20
21        for(int i = 0;i < (length+1)/2;i++)
22        {
23            int temp = list.get(i);
24            list.set(i , list.get(length-i-1));
25            list.set(length-i-1 , temp);
26        }
27
28        for(int i = 0;i < (length-k+1)/2;i++)
29        {
30            int temp = list.get(i);
31            list.set(i , list.get(length-k-i-1));
32            list.set(length-k-i-1 , temp);
33        }
34
35        for(int i = 0;i < (k+1)/2;i++)
36        {
37            int temp = list.get(length-k+i);
38            list.set(length-k+i , list.get(length-i-1));
39            list.set(length-i-1 , temp);
40        }
41
42        int pointer = 0;
43        for(int i = 0;i < nums.length;i++)
44            if(!negPos[i])
45                nums[i] = list.get(pointer++);
46
47        return nums;
48    }
49}