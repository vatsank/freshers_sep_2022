package com.training.task3;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  BankAccount account = new BankAccount(1000);
	  
	   Thread firstThread = new Thread() {

		@Override
		public void run() {

		 System.out.println("Current Balance After Withdrawl:="+account.withdraw(5000));	
		}
		   
	   };
	   
	   firstThread.start();
	   

	   Thread secondThread = new Thread() {

			@Override
			public void run() {

				System.out.println("Current Balance After Deposit:="+account.deposit(7000));
			}
			   
		   };
		   
		   secondThread.start();

	}

	
}
