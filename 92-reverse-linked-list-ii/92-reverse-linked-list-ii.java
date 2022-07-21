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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null)
            return null;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        
        int i=1;
        while(i<left)
        {
            prev= prev.next;
            i++;
        }
        
        ListNode start = prev.next;
        
        while(left<right)
        {
            ListNode temp1 = start.next;
            start.next = temp1.next;
            temp1.next = prev.next;
            prev.next = temp1;
            left++;
            
        }
        return temp.next;
    }
}