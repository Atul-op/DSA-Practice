// Last updated: 10/08/2026, 16:14:51
class MyLinkedList
{
    class Node
    {
        int val;
        Node next;
        Node prev;
        public Node(){}
        public Node(int val)
        {
            this.val = val;
        }
        public Node(int val,Node next)
        {
            this.val = val;
            this.next = next;
        }
        public Node(int val,Node prev,Node next)
        {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
    Node head;
    Node tail;
    int length;
    public MyLinkedList()
    {
        length = 0;
    }
    
    public int get(int index)
    {
        if(index>=length)
            return -1;
        Node ans;
        if(index<length/2)
        {   
            ans = head;
            for(int i = 0;i < index;i++)
                ans=ans.next;
        }
        else
        {
            ans = tail;
            for(int i = 0;i < length-index-1;i++)
                ans=ans.prev;
        }
        return ans.val;
    }
    
    public void addAtHead(int val)
    {
        Node node = new Node(val,head);
        if(head != null)
            head.prev = node;
        head = node;
        if(length == 0)
            tail=head;
        length++;
    }
    
    public void addAtTail(int val)
    {
        Node node = new Node(val,tail,null);
        tail.next = node;
        tail = node;
        if(length == 0)
            head = tail;
        length++;
    }
    
    public void addAtIndex(int index, int val)
    {
        if(index == 0)
        {
            addAtHead(val);
            return;
        }
        if(index == length)
        {
            addAtTail(val);
            return;
        }
        Node node;
        if(index < length/2)
        {
            node = head;
            for(int i = 0;i < index-1;i++)
                node=node.next;
        }
        else
        {
            node = tail;
            for(int i = 0;i < length-index;i++)
                node=node.prev;
        }
        Node added = new Node(val,node,node.next);
        node.next = added;
        added.next.prev = added;
        length++;
    }
    
    public void deleteAtIndex(int index)
    {
        if(index >= length)
            return;
        if(index == 0)
        {
            head=head.next;
            if(head!=null)
                head.prev=null;
            length--;
            return;
        }
        if(index == length-1)
        {
            tail=tail.prev;
            tail.next=null;
            length--;
            return;
        }
        Node node;
        if(index < length/2)
        {
            node = head;
            for(int i = 0;i < index-1;i++)
                node=node.next;
        }
        else
        {
            node = tail;
            for(int i = 0;i < length-index;i++)
                node=node.prev;
        }
        node.next = node.next.next;
        node.next.prev = node;
        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */