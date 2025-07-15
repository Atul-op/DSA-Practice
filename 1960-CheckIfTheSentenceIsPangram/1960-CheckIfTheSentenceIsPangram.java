// Last updated: 7/15/2025, 3:21:45 PM
class Solution {
    public boolean checkIfPangram(String sentence)
    {
        if(sentence.length() < 26)
            return false;
        else
            for(char i = 'a';i <= 'z';i++)
                if(sentence.indexOf(i) < 0)
                    return false;
        return true;
    }
}