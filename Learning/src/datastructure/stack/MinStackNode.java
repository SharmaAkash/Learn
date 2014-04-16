package datastructure.stack;

public class MinStackNode<T> extends StackNode<T> {
    
	T minValue;
	
	public MinStackNode(T x) {
		super(x);
		this.minValue = x;		
	}

}
