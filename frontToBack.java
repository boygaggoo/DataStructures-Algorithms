public void frontToBack(){
    ListNode first = front;
    ListNode current = front;
    while(current!=null){ 
        if(current.next==null){
            current.next = new ListNode(first.data);
            front = first.next;
            break;
        }else{
            current = current.next;}
    }
}