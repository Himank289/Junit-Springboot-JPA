package him.oops.java;

public class Account {
	private int acno;
	 private String name;
	 private int balance;
//	private int amount;
//	private int wamount;
	
	public Account()
	{
		System.out.println("Default Constructor");
	}
	
	
	public Account(int acno, String name, int balance) {
		System.out.println("parameterised called");
		this.acno=acno;
		this.name=name;
		this.balance=balance;
	}


	public int getBalance() {
		return balance;
	}
//
//
	public void setBalance(int balance) {
		if(balance >=0) {
			this.balance = balance;
		}
		else {
			System.out.println("Balance can't be negative");
		}
	}

//
	public int getAcno() {
		return acno;
	}
//
//
	public String getName() {
		return name;
	}
	
	public int deposit(int amount) {
		return amount+this.balance;
		
	}
	
	public int withdraw(int am) {
		return this.balance-am;
	}
	
	@Override
	public String toString()
	{
		
		return "Account etails:ac_id:"+this.acno
			   +", ac_name:"+this.name
			   +", ac_balance:"+this.balance;
	}
	
	
}





