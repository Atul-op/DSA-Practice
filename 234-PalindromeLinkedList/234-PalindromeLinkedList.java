// Last updated: 7/15/2025, 3:23:07 PM
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
class Solution {
    public boolean isPalindrome(ListNode head)
    {
        if(head.next == null)
            return true;
        ListNode tail = head;
        ListNode mid = tail;
        while(tail.next != null && tail.next.next != null)
        {
            mid = mid.next;
            tail = tail.next.next;
        }
        ListNode last = mid;
        ListNode newEnd = mid.next;
        ListNode prev = newEnd;
        ListNode current = prev.next;
        ListNode next = null;
        if(current != null)
            next = current.next;
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

        ListNode first = head;
        ListNode second = prev;

        while(second != null)
        {
            if(first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
}