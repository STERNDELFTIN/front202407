package ch06.practice;

public class Account2 {
	
	// Variable
	private String accountNum;
	private String name;
	private int currentMoney;
	
	// Constructor
	public Account2() {}
	
	public Account2(String accountNum, String name, int currentMoney) {
		this.accountNum = accountNum;
		this.name = name;
		this.currentMoney = currentMoney;
	}
	
	// Getter & Setter
	public String getAccountNum() { return accountNum; }
	public void setAccountNum(String accountNum) { this.accountNum = accountNum; }
		
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
		
	public int getCurrentMoney() { return currentMoney; }
	public void setCurrentMoney(int currentMoney) { this.currentMoney = currentMoney; }
}
