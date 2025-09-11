package week2.Day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser Methods = new Browser();
		Methods.launchBrowser("Chome");
		String url = Methods.loadUrl("Google.com");
		System.out.println(url);

	}

}
