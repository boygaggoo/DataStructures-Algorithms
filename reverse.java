//reverse a linkedList

public void reverse(){
    //initialize previous, current and next nodes
    ListNode previous = null;
    ListNode current = front;
    
    //swap pointers until current is null
    while(current != null) {
        ListNode next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    front = previous;
}