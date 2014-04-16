package datastructure.tree;

import java.util.ArrayList;

public class BTreeNode<T> extends TreeNode<T>{

	BTreeNode<T> left;
	BTreeNode<T> right;
    T val;
    
    public BTreeNode(T data){
    	this.left = null;
    	this.right = null;
    	this.val = data;
    }
	
    public void addChild(BTreeNode<T> x, BTreeNode<T> y) {    	
    	super.addChild(x);
    	super.addChild(y);
    }
    
   
}
