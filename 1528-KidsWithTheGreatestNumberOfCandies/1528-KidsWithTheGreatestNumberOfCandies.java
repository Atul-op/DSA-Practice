// Last updated: 7/15/2025, 3:22:04 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = 0;
        ArrayList<Boolean> list = new ArrayList<>();
        for(int candy : candies)
            m = Math.max(m , candy);
        for(int candy : candies)
            list.add((candy+extraCandies) >= m);
        return list;
    }
}