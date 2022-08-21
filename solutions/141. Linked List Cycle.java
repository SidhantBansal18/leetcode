/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        Set<ListNode> checkForCycle = new HashSet();
        
        while(head != null){
            
            if(checkForCycle.contains(head)){
                return true;
            }
            
            checkForCycle.add(head);
            head = head.next; 
            
        }
        
        return false;
    }
}
