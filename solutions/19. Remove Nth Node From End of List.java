/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        int len = 0;
        ListNode first = head;
        
        while(first != null){
            first = first.next;
            len++;
        }
        
        len = len-n;
        first = dummy;
        while(len > 0){
            first = first.next;
            len--;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
