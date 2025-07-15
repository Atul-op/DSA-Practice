// Last updated: 7/15/2025, 3:22:25 PM
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
    // public int findLength(ListNode head)
    // {
    //     int length = 0;
    //     ListNode temp = head;
    //     while(temp != null)
    //     {
    //         length++;
    //         temp = temp.next;
    //     }
    //     return length;
    // }
    // public ListNode middleNode(ListNode head)
    // {
    //     int length = findLength(head);
    //     for(int i = 1;i <= length/2;i++)
    //         head = head.next;
    //     return head;
    // }
    public ListNode middleNode(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}