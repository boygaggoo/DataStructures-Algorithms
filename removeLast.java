public int removeLast(){
    if(front == null){
        throw new NoSuchElementException();
    }
    ListNode current = front;
    ListNode next = current.next;
    
    if(current.next==null){
        next = front;
        front = null;
        return next.data;
    }
    while(current.next!=null){
        //check if the next element is the last
            ListNode check = current.next.next;
            if(check==null){
                next = current.next;
                current.next=null; //make last element null
            }else{
                current = current.next;
            }
        }
    return next.data; //return last element
}