// Last updated: 10/08/2026, 16:16:52
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        ListNode a = headA;
        ListNode b = headB;
        int l1 = 0,l2 = 0;
        while(a != null)
        {
            l1++;
            a = a.next;
        }
        while(b != null)
        {
            l2++;
            b = b.next;
        }
        if(l2 > l1)
            for(int i = 0;i < l2-l1;i++)
                headB = headB.next;
        else
            for(int i = 0;i < l1-l2;i++)
                headA = headA.next;
        while(headA != null && headA != headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}