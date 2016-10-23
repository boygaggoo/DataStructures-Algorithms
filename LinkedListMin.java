import java.util.NoSuchElementException;

/* Write a method min that returns the minimum value in a list of integers. If 
 * the list is empty, it should throw a NoSuchElementException.
 */

public class LinkedListMin {
    ListNode front;
    private class ListNode {
	ListNode next;
	int data;
	
	public ListNode(int data, ListNode next) {
	    this.next = next;
	    this.data = data;
	}
    }
    // additional methods go here
    public int min() {
    	if(front == null){
    		throw new NoSuchElementException();
    	}       
    	int m = front.data;
    	ListNode n = front.next;
    	
    	while(n != null) {
    		if(n.data < m){
    			m = n.data;
    		}
    		n = n.next;
    		}
    	return m;
    }
}
