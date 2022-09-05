package com.example.demo;

public class QuickStart {

	public static void main(String[] args) {
		
		withoutLambda();
		withLambda();
		
	}

	private static void withLambda() {

		Runnable task = () -> {
			System.out.println("Hi From Lambda Thread");
		};
		
		Thread thread = new Thread(task);
		thread.start();
	}

	private static void withoutLambda() {

		Runnable task = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("Hi From thread");
			}
		};
		
		Thread thread = new Thread(task);
		thread.start();
	}
}
