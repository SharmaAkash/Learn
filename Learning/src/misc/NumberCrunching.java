package misc;

public class NumberCrunching {
	
	public static boolean isPalindrome(int x){
		boolean result = true;
		
		if(x<0)
			return false;
		
		int div = 1;
		while(x/div > 1){
			div *= 10;
		}
		
		int y = x;
		while(div > 0){
			int left = y/div;
			int right = y%10;
			if(left != right)
				return false;
			else
			{
				y = (y%div)/10;
				div /= 100;
			}
		}
		
		return result;
	}

}
