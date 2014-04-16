package test;
import java.util.ArrayList;

import algo.DP.LongestPalindromicSubstring;
import javaBasics.ObjectBasics;
import datastructure.stack.*;
import datastructure.tree.BTree;
import datastructure.tree.BTreeUtil;
import misc.ArrayProblems;
import misc.NumberCrunching;

public class Run {

	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		/*ObjectBasics ob = new ObjectBasics();
		//javaBasics.ObjectBasics.learnEquals();
		
		int ar[]={2,5,7,12,21,23,26,29,34,67,77,90};
		ArrayProblems ap = new ArrayProblems();
		System.out.println(ap.findClosest(ar,16));*/
	    /* ----------------------------------------- */	
		/*
		StackNode n = new StackNode(5);
		Stack st = new Stack(n);
		int ar[]={2,7,1,45,23,44,7};
		for(int i = 0;i<ar.length; i++){
			StackNode newNode = new StackNode(ar[i]);
			st.push(newNode);
		}
		st.printStack();
		*/
		
		/*
		int x = 121;
		System.out.println("Is "+x+" a palindrome:"+NumberCrunching.isPalindrome(x));
		
		String s = "";
		System.out.println("Longest Palindromic substring in "+s+" is:"+LongestPalindromicSubstring.longestPalindromicSubstr(s));
		
		*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int array[] = {1,2,3,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE} ;
		for(int i=0;i<array.length;i++){
			if(array[i] == Integer.MIN_VALUE)
				list.add(i,null);			
			else
				list.add(i, array[i]);
		}
		BTree tree = BTreeUtil.createBTree(list);
		BTreeUtil.preOrderTraversal(tree);
	}
}
