package question3;

public class CashPayment implements Payment{
	
	private int amount;
	
	public CashPayment() {};
	
	


	public CashPayment(int amount) {
	
		this.amount = amount;
	}




	public int getAmount() {
		return amount;
	}




	public void setAmount(int amount) {
		this.amount = amount;
	}




	@Override
	public void doPayment() {
		System.out.println("Payment done using Cash "+amount);

		
	}

}
