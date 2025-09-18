package week3.Day2;

public class APIClientClass {

	public void sendRequest(String endpoint) {
		System.out.println("Send request endpoint:" + endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("Send request endpoint,body,status:" + endpoint + "," + requestBody + "," + requestStatus);
	}
	public static void main(String[] args) {
		APIClientClass API = new APIClientClass();
		API.sendRequest("http");
		API.sendRequest("http", "body", true);
	}
}
