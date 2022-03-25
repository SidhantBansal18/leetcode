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
        
        ListNode result = new ListNode(0);
        ListNode resultHead = result;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            
            int num1 = (l1 != null)? l1.val: 0;
            int num2 = (l2 != null)? l2.val: 0;
            
            int sum = num1 + num2 + carry;
            
            carry = sum/10;
            
            result.next = new ListNode(sum%10);
            
            result = result.next;
            if(l1 != null)  l1 = l1.next;
            if(l2 != null)  l2 = l2.next;
        }
        
        if(carry > 0){
            result.next = new ListNode(carry);
        }
        
        return resultHead.next;
    }
}