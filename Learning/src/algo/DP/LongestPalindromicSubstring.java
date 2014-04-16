package algo.DP;

public class LongestPalindromicSubstring {

	public static String longestPalindromicSubstr(String s){
		String retVal = null;
		if(s == null || "".equals(s.trim())){
			return null;
		}
		int len = s.length();
		int table[][] = new int[len][len];
		for(int i = 0; i<len ; i++){
			table[i][i] = 1;
		}
		
		for(int i=0 ; i<len-1 ; i++){
			if(s.charAt(i) == s.charAt(i+1)){
				table[i][i+1] = 2;
			}
		}
		
		int max = 1;
		int left = -1 , right = -1;
		for(int i=len-2; i>=0 ;i--){
			for(int j=len-1; j>=0 && j>i; j--){
				if(s.charAt(i)==s.charAt(j)){
					if(i+1==j){
						table[i][j]=2;
					}
					else if(table[i+1][j-1]!=0){
						table[i][j]= 2+table[i+1][j-1];
					}
					else
						table[i][j] = 0;
					
					if(table[i][j]>max){
						max = table[i][j];
						left = i;
						right = j;
					}
				}
				else{
					table[i][j] = 0;
				}
			}
		}
		
		if(max > 1){
			retVal = s.substring(left, right+1);
		}
		return retVal;
	}
}
