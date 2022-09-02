package com.training.task3;

public class BankAccount {

	public double currentBalance;
	
	
	public BankAccount(double currentBalance) {
		super();
		this.currentBalance = currentBalance;
	}


	public synchronized double deposit(double amount) {
		
	
		this.currentBalance = this.currentBalance+amount;
		
		notifyAll();
		
		return this.currentBalance;
		
	}
	

	public synchronized double withdraw(double amount) {
		
		if(this.currentBalance<amount) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		this.currentBalance = this.currentBalance-amount;

		return this.currentBalance;
	}

	
}
