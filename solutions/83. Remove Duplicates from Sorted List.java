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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null)   return head;
        
        ListNode dummy = head;
        
        while(dummy != null){
            
            if(dummy.next != null && dummy.val == dummy.next.val){
                ListNode temp = dummy;
                while (temp.next != null && temp.val == temp.next.val){
                    temp = temp.next;
                }
                
                dummy.next = temp.next;
            }
            
            dummy = dummy.next;
            
        }
        
        return head;
        
    }
}
