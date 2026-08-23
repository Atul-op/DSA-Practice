// Last updated: 23/08/2026, 08:38:59
1class Solution
2{
3    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper)
4    {
5        HashSet<Integer> set = new HashSet<>();
6        for(int num : nums)
7            set.add(num);
8        List<List<Integer>> ans = new ArrayList<>();
9        List<Integer> inner = new ArrayList<>();
10        int last = 0;
11        for(int i = lower;i <= upper;i++)
12        {
13            if(!set.contains(i))
14            {
15                if(inner.size() <= 1)
16                    inner.add(i);
17                else
18                {
19                    inner.remove(1);
20                    inner.add(i);
21                }
22            }
23            else
24            {
25                if(inner.size() > 0)
26                {
27                    if(inner.size() == 1)
28                        inner.add(inner.get(0));
29                    ans.add(inner);
30                }
31                inner = new ArrayList<>();
32            }
33        }
34        if(inner.size() > 0)
35        {
36            if(inner.size() == 1)
37                inner.add(inner.get(0));
38            ans.add(inner);
39        }
40        return ans;
41    }
42}