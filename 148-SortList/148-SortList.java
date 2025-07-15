// Last updated: 7/15/2025, 3:23:20 PM
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
    public ListNode mergeList(ListNode list1 , ListNode list2)
    {
        ListNode head = new ListNode();
        ListNode tail = head;
        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                tail.next = list1;
                list1 = list1.next;
            }
            else
            {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1 == null? list2:list1;
        return head.next;
    }
    public ListNode middleNode(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode middle = middleNode(head);
        ListNode temp = middle.next;
        middle.next = null;
        return mergeList(sortList(head) , sortList(temp));
    }
}