package datastructure.tree;

import java.util.List;

public abstract class TreeNode<T> {
  public T obj;
  public List<TreeNode<T>> children; 
  
  public int numOfChildren(){
	  return children.size();
  }
  
  public void addChild(TreeNode<T> x){
	  children.add(x);
  }
}
