package week3.Day2;

public class Amazon extends CanaraBank {

	public void casnOnDelivery() {
		System.out.println("Cash on delivery option is available");
	}

	public void upiPayments() {
		System.out.println("UPI payments is available for canara bank customers");
	}

	public void cardPaments() {
		System.out.println("Card payments are available for canara bank debit cards");
	}

	public void internetBanking() {
		System.out.println("Internet banking is available for canara bank customers");
		
	}
	public static void main(String[] args) {
		Amazon bank = new Amazon();
		bank.cardPaments();
		bank.casnOnDelivery();
		bank.upiPayments();
		bank.internetBanking();
		bank.recordPaymentDetails();
		bank.NRIAccount();
		Payments.customerFeedback();
	}

	

}
