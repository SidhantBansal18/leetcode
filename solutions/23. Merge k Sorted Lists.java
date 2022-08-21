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
        
        ListNode result = new ListNode();
        ListNode resultHead = result; 
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);
        
        for(ListNode list: lists){
            while(list != null){
                pq.add(list);
                list = list.next;
            }
        }
        
        while(!pq.isEmpty()){
            result.next = pq.remove();
            result = result.next;
        }
        
        result.next = null;
        
        return resultHead.next;
    }
}
