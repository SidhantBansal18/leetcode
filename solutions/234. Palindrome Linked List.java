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
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null)    return true;
        
        ListNode left = head;
        ListNode right = split(head);
        right = reverse(right);
        
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        
        return true;
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    
    public ListNode split(ListNode head){
        ListNode prev = head;
        
        while(head != null && head.next != null){
            head = head.next.next;
            prev = prev.next;
        }
        
        if(head != null){
            prev = prev.next;
        }
        
        return prev;
    }
}
