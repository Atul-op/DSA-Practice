// Last updated: 7/15/2025, 3:23:11 PM
class MyQueue
{
    Stack<Integer> org;
    Stack<Integer> inverted;

    public MyQueue()
    {
        org = new Stack<>();
        inverted = new Stack<>();
    }
    
    public void push(int x)
    {
        org.push(x);
    }
    
    public int pop()
    {
        while(!org.isEmpty())
        {
            inverted.push(org.pop());
        }
        int popped = inverted.pop();
        while(!inverted.isEmpty())
        {
            org.push(inverted.pop());
        }
        return popped;
    }
    
    public int peek()
    {
        while(!org.isEmpty())
        {
            inverted.push(org.pop());
        }
        int popped = inverted.peek();
        while(!inverted.isEmpty())
        {
            org.push(inverted.pop());
        }
        return popped;
    }
    
    public boolean empty() {
        return org.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */