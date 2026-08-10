// Last updated: 10/08/2026, 16:19:00
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        boolean carry = false;
        ListNode l3 = new ListNode();
        ListNode itr = l3;
        while(l1 != null || l2 != null)
        {
            int sum = 0;
            if(l1 != null)
                sum += l1.val;
            if(l2 != null)
                sum += l2.val;
            if(carry)
                sum++;
            if(sum < 10)
                carry = false;
            else
            {
                carry = true;
                sum -= 10;
            }
            ListNode node = new ListNode(sum);
            itr.next = node;
            itr = itr.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry)
        {
            ListNode node = new ListNode(1);
            itr.next = node;
            itr = itr.next;
        }
        return l3.next;
    }
}