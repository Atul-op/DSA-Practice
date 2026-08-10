// Last updated: 10/08/2026, 16:14:14
class Solution
{
    public boolean parseBoolExpr(String expression)
    {
        if(expression.equals("f"))
            return false;
        if(expression.equals("t"))
            return true;
        if(expression.charAt(0) == '!')
            return !(parseBoolExpr(expression.substring(2,expression.length()-1)));
        char checker = expression.charAt(0);
        int i = 2;
        while(i<expression.length()-1)
        {
            if(expression.charAt(i) == 'f')
            {
                if(checker == '&')
                    return false;
                i+=2;
                continue;
            }
            if(expression.charAt(i) == 't')
            {
                if(checker == '|')
                    return true;
                i+=2;
                continue;
            }
            boolean inner;
            int firstOpen = expression.indexOf('(' , i+2);
            int firstClose = expression.indexOf(')' , i+2);
            while(firstOpen != -1 && firstOpen < firstClose)
            {
                firstOpen = expression.indexOf('(' , firstOpen+1);
                firstClose = expression.indexOf(')' , firstClose+1);
            }
            if(expression.charAt(i) == '!')
                inner = !(parseBoolExpr(expression.substring(i+2,firstClose)));
            else
                inner = parseBoolExpr(expression.substring(i,firstClose+1));
            i = firstClose+2;
            if(inner)
            {
                if(checker == '|')
                    return true;
            }
            else
            {
                if(checker == '&')
                    return false;
            }
        }
        return (checker == '&'?true:false);
    }
}