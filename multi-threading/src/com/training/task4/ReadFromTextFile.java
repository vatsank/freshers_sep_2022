package com.training.task4;

import java.io.File;

public class ReadFromTextFile implements Runnable {

	/*
	 * If the ReadFromTextfile tries to read a file which is empty 
	 * it will wait for the writeToTextFile to complete and then read the 
	 *  content and display the same.
	 *   
	 */
	@Override
	public void run() {

		try {
			
			File textFile = new File("Data.txt");
			
			 if(textFile.length()==0) {
				 wait();
			 }
			readFromFile(textFile);
		} catch (Exception e) {
             e.printStackTrace();
		}
	}

	private void readFromFile(File textFile) {
		
		
	}

}
