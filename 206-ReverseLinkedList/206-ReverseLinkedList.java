// Last updated: 7/15/2025, 3:23:12 PM
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
    public ListNode reverseList(ListNode head)
    {
        // if(head == null || head.next == null)
        //     return head;
        // ListNode ans = reverseList(head.next);
        // ListNode temp = ans;
        // while(temp.next != null)
        //     temp = temp.next;
        // temp.next = head;
        // head.next = null;
        // return ans;
        if(head == null || head.next == null)
            return head;
        // ListNode tail = head;
        // head = head.next;
        // tail.next = null;
        // ListNode temp = head;
        // head = head.next;
        // temp.next = tail;
        // if(head == null)
        //     return temp;
        // while(head.next != null)
        // {
        //     tail = temp;
        //     temp = head;
        //     head = head.next;
        //     temp.next = tail;
        // }
        // head.next = temp;
        // return head;
        ListNode prev = null;
        ListNode next = head.next;
        while(head != null)
        {
            head.next = prev;
            prev = head;
            head = next;
            if(next != null)
                next = next.next;
        }
        return prev;
    }
}