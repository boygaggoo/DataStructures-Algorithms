public class LinkStuff {

    public class Node {
        int data; 
        Node next;
        Node(int i, Node link) {
            data = i;
            next = link;
        }
    }
    public class DNode {
        int data;
        DNode prev,next;
        public DNode(int i, DNode before, DNode after) {
            data = i;
            prev = before;
            next = after;
        }
    }
    public Node createNList(int n){
        Node newNode = new Node(n, null);
        Node temp = newNode;
    	if(n<=0){
    		return null;}
    	if(n==1){
    		return new Node(1, null);}
        for(int i = 1; i < n; i++){
        	temp.next = new Node(n, null);
        	temp = temp.next;
        }
        return newNode;
    }
    public Node createGaussList(int n) {
    	if(n<=0){return null;}
    	Node newNode = new Node(n, null);
        Node temp = newNode;
        int t = 1;
        while(t<=n){
        	for(int i=1; i<=t; i++){
        		temp.next = new Node(t, null);
        		temp = temp.next;
        	}
        	t++;
        }
    	return newNode;
    }
    public Node createGaussListRecurs(int n) {
    	
    	if(n<1){
    		return null;} 
    	if (n == 1) {
    		return new Node(1, null);}
    	Node first = createGaussListRecurs(n-1);
    	Node temp=first;
    	while(temp.next != null){
    		temp = temp.next;
    		}
    	temp.next = createNList(n);
    	return first;
    }
    
    public DNode removeEveryOther(DNode list) {
    	
    }
    public static void main(String[] args){
    	LinkStuff cc = new LinkStuff();
      	System.out.print(cc.createGaussList(3));
      }
}
