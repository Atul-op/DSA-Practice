// Last updated: 7/15/2025, 3:23:26 PM
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
    // public ListNode merge(ListNode first , ListNode second , ListNode third)
    // {
    //     ListNode ans;
    //     if(first == null)
    //         ans = second;
    //     else
    //     {
    //         ans = first;
    //         while(first.next != null)
    //             first = first.next;
    //         first.next = second;
    //     }
    //     while(second.next != null)
    //         second = second.next;
    //     second.next = third;
    //     return ans;
    // }
    // public ListNode reverse(ListNode head)
    // {
    //     if(head == null)
    //         return null;
    //     ListNode prev = null;
    //     ListNode next = head.next;
    //     while(head != null)
    //     {
    //         head.next = prev;
    //         prev = head;
    //         head = next;
    //         if(next != null)
    //             next = next.next;
    //     }
    //     return prev;
    // }
    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        // if(head == null || head.next == null || left == right)
        //     return head;
        // right = right-left;
        // ListNode first = null;
        // ListNode second = head;
        // if(left > 1)
        // {
        //     first = head;
        //     while(left > 2)
        //     {
        //         head = head.next;
        //         left--;
        //     }
        //     second = head.next;
        //     head.next = null;
        // }
        // head = second;
        // while(right > 0)
        // {
        //     head = head.next;
        //     right--;
        // }
        // ListNode third = head.next;
        // head.next = null;
        // return merge(first,reverse(second),third);
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
}