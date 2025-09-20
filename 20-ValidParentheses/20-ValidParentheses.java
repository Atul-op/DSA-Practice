// Last updated: 9/20/2025, 4:57:06 PM
class Solution
{
    public boolean isValid(String s)
    {
        Stack<Integer> stack = new Stack<>();
        //1 = ( , 2 = { , 3 = [
        int length =  s.length();
        for(char ch : s.toCharArray())
        {
            switch(ch)
            {
                case '(' : stack.push(1);
                break;
                case '{' : stack.push(2);
                break;
                case '[' : stack.push(3);
                break;
                case ')' :
                if(stack.isEmpty())
                    return false;
                if(stack.peek() == 1)
                {
                    stack.pop();
                    break;
                }
                else
                    return false;
                case '}' : 
                if(stack.isEmpty())
                    return false;
                if(stack.peek() == 2)
                {
                    stack.pop();
                    break;
                }
                else
                    return false;
                case ']' : 
                if(stack.isEmpty())
                    return false;
                if(stack.peek() == 3)
                {
                    stack.pop();
                    break;
                }
                else
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}