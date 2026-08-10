// Last updated: 10/08/2026, 16:16:15
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution
{
    public void deleteNode(ListNode node)
    {
        ListNode tail = node.next;
        while(tail != null)
        {
            node.val = tail.val;
            if(tail.next != null)
                node = tail;
            else
                node.next = null;
            tail = tail.next;
        }
    }
}