package week3.Day2;

public interface Payments {
	void casnOnDelivery();
	void upiPayments();
	void cardPaments();
	void internetBanking();
	default void NRIAccount() {
		System.out.println("Canara bank can provide NRI accounts to customers");
	}
	static void customerFeedback() {
		System.out.println("Customer feedback is necessary at regular intervals");
	}

}
