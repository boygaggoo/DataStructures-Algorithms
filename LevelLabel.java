public class LevelLabel {
	//Write method recharge that returns a new tree, isomorphic (same shape) as the tree parameter
	//but in which each node's info field is equal to that node's level in the tree. The root
	//is at level one, and for each node, its level is one more than its parent's level.
	
	public TreeNode recharge(TreeNode t) {
		return helper(t,1);
	}
	public TreeNode helper(TreeNode t, int level){
		if(t==null) return null;
		return new TreeNode(level, helper(t.left,level+1), helper(t.right,level+1));
	}
	
}