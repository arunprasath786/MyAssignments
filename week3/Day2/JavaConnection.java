package week3.Day2;

public class JavaConnection extends MySqlConnection {

	
	
	public static void main(String[] args) {
		JavaConnection database = new JavaConnection();
		database.connect();
		database.disconnect();
		database.executeUpdate();
		database.executeQuery();
	}

	@Override
	void executeQuery() {
		System.out.println("Query is executed successfully");
		
	}

}
