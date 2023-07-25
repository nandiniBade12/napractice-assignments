package itransform.oopsconcept;

public class BalanceCheck {
	
	private double balance;
	
	private double fixed_deposit;
	
	private double cash_credit;
	
	public BalanceCheck() {
		super();
	}

	public BalanceCheck(double balance, double fixed_deposit, double cash_credit) {
		super();
		this.balance = balance;
		this.fixed_deposit = fixed_deposit;
		this.cash_credit = cash_credit;
	}



	public double getBalance1(double fixed_deposit) {
		return fixed_deposit;
	}
	
	public double getBalance(double cash_credit) {
		return cash_credit;
	}

	public static void main(String[] args) {
		
		
		double total_amount=0;
		
	}

}
