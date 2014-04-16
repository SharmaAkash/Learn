package datastructure.tree;

import java.util.ArrayList;

public class BTreeUtil {
	public static  <T> BTree<T> createBTree(ArrayList<T> list){
		return new BTree<T>(list);		
	}
	
	public static <T> void preOrderTraversal(BTree<T> tree){
		BTree.preOrderTraversal(tree.root);
	}
	

}
