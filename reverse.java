/* Write a method evenSum that returns the sum of the values in even
 * indices in a list of integers. Assume we are using a zero-based indexing 
 * where the first value in the list has index 0, the second value has 
 * index 1, and so on.
 */
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