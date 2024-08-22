package ch06.practice;

public class Account {

	// Variable
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	// Constructor
	public Account() {}
	
	// Method
	public boolean checkSetBalance(int balance) {
		if (balance < MIN_BALANCE || balance > MAX_BALANCE)
			return false;
		else
			return true;
	}
	
	// Getter & Setter
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(checkSetBalance(balance) == true) {
			this.balance = balance;
		}
			
	}
}
