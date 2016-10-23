import java.util.LinkedList;

public class lastIndexOf {
    ListNode front;
    private class ListNode {
	ListNode next;
	int data;
	
	public ListNode(int data, ListNode next) {
	    this.next = next;
	    this.data = data;
	}
    }
    public int lastIndexOf(int i){
        if(front == null){
            return -1;
        }
        if(front.next==null && front.data==i){
                return 0;
        }
        int ind = 0;
        int ans = -1;
        ListNode current = front;
        while(current.next!=null){
            if(current.data==i){
                ans=ind;
    	        }
            current = current.next;
            ind++;
    	    }
        return ans;
    }
    public static void main(LinkedList args){
  	  lastIndexOf cc = new lastIndexOf();
      	int[] avail = {1,2,1,3,4};
      	System.out.println(cc.lastIndexOf(avail));
      }
}