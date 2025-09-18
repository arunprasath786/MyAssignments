package week3.Day1;

public class Edge extends Browser{
	
public void takeSnap() {
	System.out.println("Take snap of webpage");
}
public void clearCookies() {
	System.out.println("Clear cookies");
}

public static void main(String[] args) {
	Edge openEdge = new Edge();
	openEdge.openURL();
	openEdge.closeBrowser("Edge", 120.40f);
	openEdge.navigateBack();
	openEdge.takeSnap();
	openEdge.clearCookies();
}
}
