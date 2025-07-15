// Last updated: 7/15/2025, 3:23:54 PM
class Solution {
    List<String> helper(String p,String digits)
    {
        List<String> list = new ArrayList<>();
        if(digits.isEmpty())
        {
            list.add(p);
            return list;
        }
        int digit = digits.charAt(0)-'0';
        String up = switch (digit) {
            case 2 -> "abc";
            case 3 -> "def";
            case 4 -> "ghi";
            case 5 -> "jkl";
            case 6 -> "mno";
            case 7 -> "pqrs";
            case 8 -> "tuv";
            case 9 -> "wxyz";
            default -> "";
        };
        for(int i = 0;i < up.length();i++)
        {
            list.addAll(helper(p+up.charAt(i), digits.substring(1)));
        }
        return list;
    }
    public List<String> letterCombinations(String digits)
    {
        if(digits.isEmpty())
            return new ArrayList<>();
        return helper("",digits);
    }
}