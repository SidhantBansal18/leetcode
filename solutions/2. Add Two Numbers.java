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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int a;
            int b; 
            int sum;
            if(l1 == null){
                a = 0;
            }
            else{
                a = l1.val;
            }
            if(l2 == null){
                b = 0;
            }
            else{
                b = l2.val;
            }
            
            sum = a + b + carry;
            carry = sum/10;
            
            ListNode nextNode = new ListNode(sum%10);
            dummy.next = nextNode;
            
            dummy = dummy.next;
            if(l1 != null)    l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        if(carry != 0){
            ListNode nextNode = new ListNode(carry);
            dummy.next = nextNode;
        }
        return head.next;
        
    }
}
