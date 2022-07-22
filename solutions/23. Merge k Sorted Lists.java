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
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode result = new ListNode(0);
        
        ListNode resultHolder = result;
        
        PriorityQueue<ListNode> listNums = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);
        
        for(ListNode list: lists){
            
            while(list != null){
                listNums.add(list);
                list = list.next;
            }
            
        }
        
        while(!listNums.isEmpty()){
            result.next = listNums.remove();
            result = result.next;
        }
        result.next = null;
        return resultHolder.next; 
    }
}
