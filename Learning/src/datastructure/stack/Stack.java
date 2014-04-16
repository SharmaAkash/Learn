package datastructure.stack;

public class Stack<T> {
   StackNode<T> top;
   
   public Stack(StackNode<T> n){
	  top = n;
	  top.next = null;
   }
   
   public void push(StackNode<T> n){
	   if(top == null)
	   {
		   top = n;
		   top.next = null;		   
	   }
	   else{
		   n.next = top;
		   top = n;
	   }
   }
   
   public StackNode<T> pop()
   {
	   StackNode<T> poppedNode = top;
	   top = top.next;
	   return poppedNode;
   }
   
   public void printStack(){
	   StackNode<T> n = top;
	   while(n!=null){
		   System.out.println(n.data);
		   n = n.next;
	   }
   }
}
