package com.training.task4;
import java.io.*;
public class WriteToTextFile implements Runnable {

	@Override
	public void run() {

		File textFile = new File("Data.txt");

		writeTofile(textFile);
		
		notify();
	}

	private void writeTofile(File textFile) {
		// TODO Auto-generated method stub
		
	}

}
