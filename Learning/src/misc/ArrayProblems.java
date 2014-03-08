package misc;

public class ArrayProblems {

	/*
	 * Given a sorted array and a number n, find a number from the array closest
	 * to n
	 */
	public int findClosest(int ar[], int x) {
		int retVal = 0;
		int begin = 0, end = ar.length - 1;
		while (begin <= end) {
			int mid = begin + (end - begin) / 2;
			
			if(x <= ar[begin])
				return ar[begin];
			if( x >= ar[end])
				return ar[end];

			if (ar[mid] == x) 
			{
				return ar[mid];
			} 
			else if (ar[mid] < x) 
			{
				if(((mid+1)<=end) && (Math.abs(x-ar[mid]) < Math.abs(ar[mid+1]-x)))
					return ar[mid];
				else
					begin = mid + 1;						
				
			} 
			else 
			{
				if(((mid-1)>=begin) && (Math.abs(ar[mid]-x) < Math.abs(ar[mid-1]-x)))
					return ar[mid];
				else
					end = mid - 1;
			}
		}
		return -1;
	}
	
}
