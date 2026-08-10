// Last updated: 10/08/2026, 16:12:56
class Solution
{
    public String reverseByType(String s)
    {
        int length = s.length();
        StringBuilder result = new StringBuilder();;
        Stack<Character> alpha = new Stack<>();
        Stack<Character> special = new Stack<>();
        boolean[] isSpecial = new boolean[length];
        for(int i = 0;i < length;i++)
        {
            char ch = s.charAt(i);
            if(ch >= 97 && ch <= 122)
                alpha.push(ch);
            else
            {
                isSpecial[i] = true;
                special.push(ch);
            }
        }
        for(int i = 0;i < length;i++)
        {
            if(isSpecial[i])
                result.append(special.pop());
            else
                result.append(alpha.pop());
        }
        return result.toString();
    }
}