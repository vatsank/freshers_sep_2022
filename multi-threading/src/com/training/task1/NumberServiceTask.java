package com.training.task1;

public class NumberServiceTask implements Runnable  {  // 1 implement runnable

	
	private String name;
	private NumberService service;
	private int countTo;
	
	
	
	public NumberServiceTask(String name, int countTo) {
		super();
		this.name = name;
		this.countTo = countTo;
		this.service=new NumberService();
		
		Thread thread= new Thread(this, name);   //2 pass runnable to thread constructor
		thread.start();   //3  make the thread runnable by invoking start
	}



	@Override
	public void run() {

		System.out.println(this.service.sumNumbers(countTo)); 
		//4  the code that should run as thread,run method gets called by thread scheduler
	}

}
