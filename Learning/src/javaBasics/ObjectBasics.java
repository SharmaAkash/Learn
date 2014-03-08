package javaBasics;

/**
 * 
 * @author Akash
 *  This class contains examples of 
 *  1) hashCode
 *  2) equals method
 */
public class ObjectBasics {
	
	public void ObjecBasics(){
		System.out.println("HashCode of this object is : "+this.toString());
	}
	
	public static void learnEquals(){
		String first = "Akash";
		String second = new String("Akash");
		if(first.equals(second))
			System.out.println("String variables are equal based on their content !");
		
		StringBuilder sbFirst = new StringBuilder("Sharma");
		StringBuilder sbSecond = new StringBuilder("Sharma");
		if(!sbFirst.equals(sbSecond))
			System.out.println("StringBuilder variables are equal based on default Object " +
					"implementation of equals method !");
		
		
			
		
		
	}
	

}
