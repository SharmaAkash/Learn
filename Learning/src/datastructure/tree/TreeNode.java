package datastructure.tree;

import java.util.List;

public abstract class TreeNode {
  public Object obj;
  public List<TreeNode> children; 
  
  public int numOfChildren(){
	  return children.size();
  }
  
  public void addChild(TreeNode x){
	  children.add(x);
  }
}
