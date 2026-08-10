// Last updated: 10/08/2026, 16:16:55
class MinStack
{
    private int[] arr;
    private int topIndex;
    private int minVal;
    public MinStack()
    {
        arr = new int[10];
        topIndex = -1;
        minVal = Integer.MAX_VALUE;
    }
    
    public void push(int val)
    {
        if(topIndex+1 == arr.length)
        {
            int[] temp = new int[arr.length*2];
            for(int i = 0;i < arr.length;i++)
                temp[i] = arr[i];
            arr = temp;
        }
        arr[++topIndex] = val;
        if(topIndex == 0)
            minVal = arr[topIndex];
        else
            minVal = Math.min(minVal , val);
    }
    
    public void pop()
    {
        if(topIndex != 0 && minVal == arr[topIndex])
        {
            minVal = Integer.MAX_VALUE;
            for(int i = 0;i < topIndex;i++)
                minVal = Math.min(minVal , arr[i]);
        }
        topIndex--;
    }
    
    public int top()
    {
        return arr[topIndex];
    }
    
    public int getMin()
    {
        return minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */