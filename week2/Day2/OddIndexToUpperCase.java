package week2.Day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		//01234567
		char[] charArray = test.toCharArray();
			
			for(int j=0;j<charArray.length;j++) {
			
		if(charArray[j]%2!=0) {
			 char upperCase = Character.toUpperCase(charArray[j]);
			 System.out.println(upperCase);
			
			 
			
			
			
		}
		
			}
			
			
			
		
	}
}

	


