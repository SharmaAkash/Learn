package datastructure.stack;

public class MinStackNode extends StackNode {
    
	int minValue;
	
	public MinStackNode(int x) {
		super(x);
		this.minValue = x;		
	}

}
