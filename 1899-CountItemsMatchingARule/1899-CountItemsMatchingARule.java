// Last updated: 7/15/2025, 3:21:50 PM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
        int ans = 0,p = 0;
        switch(ruleKey)
        {
            case "type" : p = 0;
            break;
            case "color" : p = 1;
            break;
            case "name" : p = 2;
            break;
        }
        for(int i = 0;i < items.size();i++)
            if(items.get(i).get(p).equals(ruleValue))
                ans++;
        return ans;
    }
}