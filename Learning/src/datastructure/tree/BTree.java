package datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BTree<T> {
    BTreeNode<T> root;
    
    public BTree(ArrayList<T> list){
    	if(list==null)
    		root = null;
    	Queue<BTreeNode<T>> queue = new LinkedList<BTreeNode<T>>();
    	root = new BTreeNode<T>(list.get(0));
    	queue.add(root);
    	int count = list.size();
    	int i = 1;
    	while(!queue.isEmpty() && i<count){
    		BTreeNode<T> node = queue.remove();
    		if(node != null){
    			node.left = new BTreeNode<T>(list.get(i));
    			queue.add(node.left);
    			i++;
        		node.right = new BTreeNode<T>(list.get(i));
        		queue.add(node.right);
        		i++;    		
        		
    		}
    	}
    }
    		
    public static void preOrderTraversal(BTreeNode<?> root){
       if(root == null)
    	  ;
       else{
    	   System.out.println(root.val);
    	   preOrderTraversal(root.left);
    	   preOrderTraversal(root.right);
    	   
       }
    }
    	
}

