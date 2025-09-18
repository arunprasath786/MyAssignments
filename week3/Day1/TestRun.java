package week3.Day1;

public class TestRun extends TestData{

	public void enterUserName() {
		System.out.println("Enter user Name");
	}
	public void enterPassword() {
		System.out.println("Enter Password");
	}
	public static void main(String[] args) {
		TestData data = new TestData();
		TestRun run = new TestRun();
		data.enterCredentials();
		data.navigateToHomePage();
		run.enterUserName();
		run.enterPassword();
	}

}
