package javaChallenge;

public class javaChallenge02 {
	
	public static int squareRoot(int number) {
		int root=1;
		for(int i=1; i*i<=number;i++) {
			root=i;	
		}
		return root;
	}

	public static void main(String[] args) {
		
		javaChallenge02 result = new javaChallenge02();
		System.out.println("Square root of number is:" + result.squareRoot(2));

	}

}
