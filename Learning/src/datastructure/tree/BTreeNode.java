package datastructure.tree;

public class BTreeNode extends TreeNode{

	BTreeNode left;
	BTreeNode right;
    
	
    public void addChild(BTreeNode x, BTreeNode y) {    	
    	super.addChild(x);
    	super.addChild(y);
    }
}
