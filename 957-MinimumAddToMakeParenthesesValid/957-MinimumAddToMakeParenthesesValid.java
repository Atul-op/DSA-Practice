// Last updated: 8/2/2025, 11:48:39 PM
class Solution 
{
    public int minAddToMakeValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
                stack.push(ch);
            else
            {
                if(stack.isEmpty() || stack.peek() != '(')
                    stack.push(ch);
                else
                    stack.pop();
            }
        }
        int ans = 0;
        while(!stack.isEmpty())
        {
            stack.pop();
            ans++;
        }
        return ans;
    }
}