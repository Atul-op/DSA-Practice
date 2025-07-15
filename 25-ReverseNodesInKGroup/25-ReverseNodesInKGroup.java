// Last updated: 7/15/2025, 3:23:51 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        if(left == right)
            return head;
        ListNode prev = null;
        ListNode current = head;
        for(int i = 0;i < left-1;i++)
        {
            prev = current;
            current = current.next;
        }
        ListNode next = current.next;
        ListNode last = prev;
        ListNode newEnd = current;
        for(int i = 0;current != null && i < right-left+1;i++)
        {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null)
                next = next.next;
        }
        if(last != null)
            last.next = prev;
        else
            head = prev;
        newEnd.next = current;
        return head;
    }
    public int giveSize(ListNode head)
    {
        int size = 0;
        while(head != null)
        {
            size++;
            head = head.next;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k)
    {
        if(k == 1)
            return head;
        int left = 1-k;
        int size = giveSize(head);
        for(int i = 1;i <= size/k;i++)
        {
            for(int j = 1;j <= k;j++)
                left++;
            head = reverseBetween(head , left , left+k-1);
        }
        return head;
    }
}