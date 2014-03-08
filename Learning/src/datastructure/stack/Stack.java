package datastructure.stack;

public class Stack {
   StackNode top;
   
   public Stack(StackNode n){
	  top = n;
	  top.next = null;
   }
   
   public void push(StackNode n){
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
   
   public StackNode pop()
   {
	   StackNode poppedNode = top;
	   top = top.next;
	   return poppedNode;
   }
   
   public void printStack(){
	   StackNode n = top;
	   while(n!=null){
		   System.out.println(n.data);
		   n = n.next;
	   }
   }
}
