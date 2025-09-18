package week3.Day2;

public class PolymorphismActivity {
	
	public void reportStep() {
		System.out.println("Print the reports:");
	}
	public void reportStep(String msg, String status) {
		System.out.println("Print report msg & status:"+ msg +"," + status);
	}
	public void reportStep(String msg, String status,boolean snap) {
		System.out.println("Print report msg,status & snap:" + msg +"," + status + "," + snap);
	}
	public void takeSnap(String message) {
		System.out.println("Webpage snap has been taken:" + message);
	}
	public static void main(String[] args) {
		PolymorphismActivity poly = new PolymorphismActivity();
		poly.reportStep();
		poly.reportStep("Hello", "Printed");
		poly.reportStep("Welcome", "notPrinted", true);
		poly.takeSnap("printed successfully");
	}
	

}
