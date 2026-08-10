// Last updated: 10/08/2026, 16:16:32
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
    public ListNode removeElements(ListNode head, int val)
    {
        ListNode ans = new ListNode();
        ListNode prev = ans;
        prev.next = head;
        while(head != null)
        {
            if(head.val == val)
            {
                head = head.next;
                prev.next = head;
            }
            else
            {
                prev = head;
                head = head.next;
            }
        }
        return ans.next;
    }
}