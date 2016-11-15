public class Isomorphic {
	public String sameShape(TreeNode s, TreeNode t) {
		if (s==null && t==null) return "same";
		if(s==null || t==null) return "different";
		
		//check if left subtrees are same
		boolean m = "same".equals(sameShape(s.left, t.left));
		if(! m) return "different"; //or if(m == false0
		boolean rr = "same".equals(sameShape(s.right, t.right));
        		if(! rr) return "different";

        		if(m && rr) return "same";
        		return  "different";
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
            }
    }
}