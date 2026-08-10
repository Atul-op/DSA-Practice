// Last updated: 10/08/2026, 16:14:18
class Solution
{
    public String removeOuterParentheses(String s)
    {
        int flag = 0;
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                flag++;
                if(flag >= 2)
                    res.append(ch);
            }
            else
            {
                flag--;
                if(flag >= 1)
                    res.append(ch);
            }
            
        }
        return res.toString();
    }
}