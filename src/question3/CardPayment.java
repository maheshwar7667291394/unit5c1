package question3;

public class CardPayment implements Payment {

	private int amount;
	
	public CardPayment() {};
	
	
	
	
	public int getAmount() {
		return amount;
	}




	public void setAmount(int amount) {
		this.amount = amount;
	}




	public CardPayment(int amount) {
		
		this.amount = amount;
	}




	@Override
	public void doPayment() {
		System.out.println("Payment done using Card "+amount);
		

		
	}

}
