// Given k linked lists where each one is sorted in the ascending order, merge all of them into a single sorted linked list.

static LinkedListNode merge_k_lists(ArrayList<LinkedListNode> lists) {
        // Write your code here.
        if(lists.size()==0 || lists.isEmpty()){
            return null;
        }
        if(lists.size() == 1){
            return lists.get(0);
        }
        LinkedListNode l1 = lists.get(0);
        int i=1;
        while(i<lists.size()){
            LinkedListNode l2 = lists.get(i);
            l1 = (merge(l1,l2));
            i++;
        }
        return l1;
    }
    
    static LinkedListNode merge(LinkedListNode l, LinkedListNode r){
        LinkedListNode head = new LinkedListNode(-1);
        LinkedListNode res = head;
        
        while(l!=null && r!=null){
            if(l.value <= r.value){
                res.next = l;
                l = l.next;
            }
            else{
                res.next = r;
                r = r.next;
            }
            res = res.next;
        }
        if(l!=null){
            res.next = l;
        }
        if(r!=null){
            res.next = r;
        }
        
        return head.next;
    }
