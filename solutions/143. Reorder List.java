        
        prevTail.next = null;
        
        ListNode secondList = reverse(slow);
        
        merge(firstList, secondList);
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
    
    public void merge(ListNode first, ListNode second){
        while(first != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
​
            first.next = second;
            
            if(temp1 == null){
                break;
            }
            
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
