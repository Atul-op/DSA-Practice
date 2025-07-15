// Last updated: 7/15/2025, 3:23:21 PM
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
    public void reverse(ListNode mid)
    {
        if(mid.next.next == null)
            return;
        ListNode last = mid;
        ListNode prev = last.next;
        ListNode newEnd = prev;
        ListNode current = prev.next;
        ListNode next = current.next;
        while(current != null)
        {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null)
                next = next.next;
        }
        last.next = prev;
        newEnd.next = null;
        return;
    }
    public ListNode getMid(ListNode head)
    {
        ListNode mid = head;
        while(head.next != null && head.next.next != null)
        {
            mid = mid.next;
            head = head.next.next;
        }
        return mid;
    }
    public void reorderList(ListNode head)
    {
        if(head.next == null || head.next.next == null)
            return;
        ListNode mid = getMid(head);
        reverse(mid);
        mid = mid.next;
        ListNode first = head;
        ListNode second = mid;
        ListNode temp = null;
        while(second != null)
        {
            temp = first;
            first = first.next;
            temp.next = second;
            temp = second;
            second = second.next;
            temp.next = first;
        }
        if(temp.next == mid)
            temp.next = null;
        else
            temp.next.next = null;
    }
}