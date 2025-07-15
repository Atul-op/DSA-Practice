// Last updated: 7/15/2025, 3:22:38 PM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c)
    {
        int n = mat[0].length;
        if((mat.length)*(n) != (r*c))
            return mat;
        int[][] res = new int[r][c];
        for(int i = 0;i < r*c;i++)
            res[i/c][i%c] = mat[i/n][i%n];
        return res;
    }
}