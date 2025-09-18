package week3.Day1;

public class Safari extends Browser {

	public void readerMode() {
		System.out.println("Reader mode:");
	}
	public void fullScreenMode() {
		System.out.println("Full screen mpde");
	}
	public static void main(String[] args) {
		Safari openSafari = new Safari();
		openSafari.openURL();
		openSafari.closeBrowser("Safari",303.3670f);
		openSafari.navigateBack();
		openSafari.readerMode();
		openSafari.fullScreenMode();
	}
}
