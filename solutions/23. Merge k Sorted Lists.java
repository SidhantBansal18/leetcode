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
        
        if(lists == null || lists.length == 0)  return null;
        
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2){
                if(l1.val < l2.val) return -1;
                else if(l1.val == l2.val)   return 0;
                else    return 1;
            }
        });
        
        for(ListNode list: lists){
            if(list != null){
                queue.add(list);
                System.out.println(list.val);
            }
        }
        
        ListNode result = new ListNode(0);
        ListNode head = result;
        
        while(!queue.isEmpty()){
            result.next = queue.poll();
            result = result.next;
        }
        
        return head.next;
    }
