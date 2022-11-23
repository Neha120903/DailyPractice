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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode temp=null;
        ListNode curr=head;
        ListNode next=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=temp;
            temp=curr;
            curr=next;
        }
        return temp;
    }
}