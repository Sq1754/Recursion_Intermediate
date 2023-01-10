
public class Recursion_Important_6 {
// Q-> Print all Subsequences of String 
	
	public static void subsequences(String str,int idx,String newString) {
		if(idx==str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currChar = str.charAt(idx);
		
		//to be included in newstring
		subsequences(str,idx+1,newString+currChar);
		
		// not to be included in newString
	    subsequences(str,idx+1,newString);
	}
	
	public static void main(String[]args) {
		String str = "abc";
		subsequences(str,0,"");
	}
}
