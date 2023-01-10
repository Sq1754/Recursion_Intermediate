
public class Recursion_Intermediate4 {
//Q->  Move all 'x' of string"axbxcxxd" to the end
   
	public static void moveAllX(String str,int idx,int count,String newString) {
		if(idx==str.length()) {
			for(int i=1; i<=count;i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}
		
		char currentChar = str.charAt(idx);
		if(currentChar=='x') {
			count++;
			moveAllX(str,idx+1,count,newString);
		}
		else {
			newString += currentChar;
			moveAllX(str,idx+1,count,newString);
		}
	}
	
	public static void main(String args[]) {
		String str = "axbxcxxd";
		moveAllX(str,0,0,"");
	}
}
