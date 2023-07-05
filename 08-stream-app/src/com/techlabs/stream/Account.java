package com.techlabs.stream;

public class Account {
	private long accountno;
	private String name;
	private double balance;
	public Account(long accountno, String name, double balance) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
