// Last updated: 7/15/2025, 3:23:33 PM
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
    public ListNode rotateRight(ListNode head, int k)
    {
        if(k == 0 || head == null || head.next == null)
            return head;
        int size = 0;
        ListNode tail = head;
        while(tail.next != null)
        {
            size++;
            tail = tail.next;
        }
        size++;
        k = k % size;
        ListNode newEnd = head;
        for(int i = 0;i < size-k-1;i++)
            newEnd = newEnd.next;
        tail.next = head;
        head = newEnd.next;
        newEnd.next = null;
        return head;
    }
}