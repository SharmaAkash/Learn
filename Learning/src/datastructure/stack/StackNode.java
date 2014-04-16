package datastructure.stack;

public class StackNode<T> {
	T data;
	StackNode<T> next;	
	
	public StackNode(T x){
		this.data = x;
		this.next = null;
	}
}
