package week3.Day2;

public class MethodOverride extends PolymorphismActivity {
	
	public void takeSnap(String message) {
		System.out.println("Take snap:" + message);
	}

	public static void main(String[] args) {
		MethodOverride OverRide = new MethodOverride();
		OverRide.takeSnap("Success");
		OverRide.reportStep("Hello", "Printed");
		OverRide.reportStep("Welcome", "Printed", false);
		
	}

}
