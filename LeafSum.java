public class LeafSum {
    public int sum(TreeNode t) {
	    int total = 0;
	    if (t == null) {
	        return total;
	    }
	    if(t.left==null && t.right==null){
	    	return total + t.info;
	    }
	    else{
	    	return sum(t.left) + sum(t.right);
	    }
	}	
	public class TreeNode {
	      int info;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x){
	          info = x;
	      }
	      TreeNode(int x, TreeNode lNode, TreeNode rNode){
	          info = x;
	   	  left = lNode;
	          right = rNode;
	      }
	  }
}
