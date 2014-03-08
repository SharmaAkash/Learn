package test;
import javaBasics.ObjectBasics;
import datastructure.stack.*;
import misc.ArrayProblems;

public class Run {

	public static void main(String[] args){
		/*ObjectBasics ob = new ObjectBasics();
		//javaBasics.ObjectBasics.learnEquals();
		
		int ar[]={2,5,7,12,21,23,26,29,34,67,77,90};
		ArrayProblems ap = new ArrayProblems();
		System.out.println(ap.findClosest(ar,16));*/
		
		StackNode n = new StackNode(5);
		Stack st = new Stack(n);
		int ar[]={2,7,1,45,23,44,7};
		for(int i = 0;i<ar.length; i++){
			StackNode newNode = new StackNode(ar[i]);
			st.push(newNode);
		}
		st.printStack();
		
		
	}
}
