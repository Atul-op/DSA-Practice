// Last updated: 7/15/2025, 3:22:31 PM
class Solution
{
    public int[][] flipAndInvertImage(int[][] image)
    {
        for(int[] img : image)
            for(int j = 0;j < (image.length+1)/2;j++)
            {
                int t = img[img.length-j-1]^1;
                img[img.length-j-1] = img[j]^1;
                img[j] = t;
            }
        return image;
    }
}