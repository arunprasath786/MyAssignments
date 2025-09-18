package week3.Day2;

public abstract class MySqlConnection {
	
	public void connect() {
		System.out.println("Establist Database connection");
	}

	public void disconnect() {
		System.out.println("Disconnect from the database");
	}

	public void executeUpdate() {
		System.out.println("update Database");
	}
	
	abstract void executeQuery(); 

}
