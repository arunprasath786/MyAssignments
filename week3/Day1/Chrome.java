package week3.Day1;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Open Chrome in Incognito mode:");
	}
	public void clearCache() {
		System.out.println("Clear cache:");
	}
	
	public static void main(String[] args) {
		Chrome openChrome = new Chrome();
		openChrome.closeBrowser("chrome", 180.412f);
		openChrome.openURL();
		openChrome.navigateBack();
		openChrome.openIncognito();
		openChrome.clearCache();
}
}