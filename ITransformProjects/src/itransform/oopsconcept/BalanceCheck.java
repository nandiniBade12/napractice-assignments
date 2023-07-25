package itransform.oopsconcept;

class AccountHolder{
	
	private String name;
	private double balance;
	
	public AccountHolder() {
		super();
	}

	public AccountHolder(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
}

class SavingsAccount extends AccountHolder{
	
	private double fixed_deposit;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String name, double balance) {
		super(name, balance);
	}
	
	public SavingsAccount(double fixed_deposit) {
		super();
		this.fixed_deposit = fixed_deposit;
	}

	@Override
	public double getBalance() {
		return super.getBalance() + fixed_deposit;
	}
	
}

class CurrentAccount extends AccountHolder{
	
	private double credit_cash;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String name, double balance) {
		super(name, balance);
	}
	
	public CurrentAccount(double credit_cash) {
		super();
		this.credit_cash = credit_cash;
	}

	@Override
	public double getBalance() {
		return super.getBalance() + credit_cash;
	}
	
}
public class BalanceCheck {

	public static void main(String[] args) {
		
		double total_balance=0;
		
		AccountHolder a1= new AccountHolder("Suresh",988455.45);
		AccountHolder savings = new SavingsAccount(500550);
		AccountHolder current = new CurrentAccount(351000);
		
		total_balance = savings.getBalance()+current.getBalance()+a1.getBalance();
		
		System.out.println("Total bank balance of account holder a1 : " + total_balance);
		
	}

}
