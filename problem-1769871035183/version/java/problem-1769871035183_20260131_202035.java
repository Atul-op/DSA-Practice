// Last updated: 1/31/2026, 8:20:35 PM
1class Solution
2{
3    public String reverseByType(String s)
4    {
5        int length = s.length();
6        StringBuilder result = new StringBuilder();;
7        Stack<Character> alpha = new Stack<>();
8        Stack<Character> special = new Stack<>();
9        boolean[] isSpecial = new boolean[length];
10        for(int i = 0;i < length;i++)
11        {
12            char ch = s.charAt(i);
13            if(ch >= 97 && ch <= 122)
14                alpha.push(ch);
15            else
16            {
17                isSpecial[i] = true;
18                special.push(ch);
19            }
20        }
21        for(int i = 0;i < length;i++)
22        {
23            if(isSpecial[i])
24                result.append(special.pop());
25            else
26                result.append(alpha.pop());
27        }
28        return result.toString();
29    }
30}