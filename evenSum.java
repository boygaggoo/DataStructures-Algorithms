public int evenSum(){
    if(front==null){
        return 0;
    }
    int sum = 0;
    int index = 0;
    ListNode current = front;
    while(current!=null){
        if(index%2==0){
            sum += current.data;            
        }
            current = current.next;
            index++;
    }
    return sum;
}