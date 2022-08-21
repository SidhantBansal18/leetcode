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
        
        ListNode result = new ListNode();
        ListNode iteratingHead = result;
        ListNode resultHead = result;
        
        result.next = head;
        int len = 0;
        
        while(result.next != null){
            len++;
            result = result.next;
        }
        
        int temp = len - n;
        
        while(temp > 0){
            iteratingHead = iteratingHead.next;
            temp--;
        }
        
        iteratingHead.next = iteratingHead.next.next;
        
        return resultHead.next;
        
    }
}
