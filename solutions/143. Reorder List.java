 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        
        ListNode first = head;
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode second = slow.next;
        ListNode previous = null;
        slow.next = null;
        
        
        while(second != null){
            
            ListNode temp = second.next;
            second.next = previous;
            previous = second;
            second = temp;
            
        }
        
        first = head;
        second = previous;
        
        while(second != null){
            
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
            
        }
        
    }
}
