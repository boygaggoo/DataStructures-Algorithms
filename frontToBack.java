public void frontToBack(){
    if (front == null || front.next == null) return;
    ListNode last = front;
    front = front.next;
    ListNode list = front;
   
    while (list.next != null){
        list = list.next;   
    }
    list.next = last;
    last.next = null;
}