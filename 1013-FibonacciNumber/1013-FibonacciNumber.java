// Last updated: 7/15/2025, 3:22:22 PM
class Solution {
    public int fib(int n)
    {
        return (int)((Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
    }
}