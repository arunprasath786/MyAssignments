package week2.Day1;

public class Browser {
	
	public void launchBrowser(String browser) {
		//String browser = "Chrome";
		System.out.println("Browser launched successfully:" + browser);
	}
	public String loadUrl(String url) {
		System.out.println("Application url printed successfully");
		return url;
		
	}

	public static void main(String[] args) {
		
		Browser LearnMethods = new Browser();
		LearnMethods.launchBrowser("Chrome");
		String url = LearnMethods.loadUrl("Google.com");
		System.out.println(url);
		
	}

}
