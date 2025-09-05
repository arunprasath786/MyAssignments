package week1.Day2;

public class Operators {

	public static void main(String[] args) {
		
		//if else & else if
		int a, b, c;
		a = 5;
		b = 10;
		c = 15;

		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}

		if (a > b) {
			System.out.println("a is greater");
		} else if (b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}

		
		//For loop
		int n = 10;

		for (n = 0; n <= 10; n++) {
			System.out.println("Print the numbers:" + n);
		}

		//Switch statement
		int date = 20;

		switch (date) {
		case 3:
			System.out.println("date is 3");
			break;
		case 5:
			System.out.println("date is 5");
			break;
		case 10:
			System.out.println("date is 10");
			break;
		default:
			System.out.println("date is 20");

		}

	}

}
