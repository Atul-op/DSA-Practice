// Last updated: 7/15/2025, 3:23:30 PM
class Solution
{
    boolean bS(int[] arr,int target, int s,int e)
    {
        while(s <= e)
        {
            int m = s+(e-s)/2;
            if(arr[m] == target)
                return true;
            if(arr[m] > target)
                e = m-1;
            else
                s = m+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int rstart = 0;
        int rend = matrix.length-1;
        int cmid = (matrix[0].length-1)/2;
        while(rstart < rend-1)
        {
            int rmid = (rstart + rend)/2;
            if(matrix[rmid][cmid] == target)
                return true;
            if(matrix[rmid][cmid] > target)
                rend = rmid;
            else
                rstart = rmid;
        }
        if(matrix[rstart][cmid] == target || matrix[rend][cmid] == target)
            return true;
        if(target < matrix[rstart][cmid])
            return bS(matrix[rstart] , target, 0 , cmid-1);
        if(target < matrix[rend][0])
            return bS(matrix[rstart] ,target , cmid+1 , matrix[rstart].length-1);
        if(target < matrix[rend][cmid])
            return bS(matrix[rend] ,target, 0 , cmid-1);
        else
            return bS(matrix[rend] ,target, cmid+1 , matrix[rend].length-1);
    }
}