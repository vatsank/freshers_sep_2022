package com.training.services;
import java.io.*;
import java.util.Arrays;

import com.training.Book;
import com.training.model.Student;
public class FileService {

	
	public double findMaxMark(File file) {
		
Double[] markList = new Double[3];
		
		String line =null;
          int idx=0;
          
		try(BufferedReader reader = 
				 new BufferedReader(new FileReader(file))){
			 
				while( (line= reader.readLine())!=null) {
					
					String[] values = line.split(",");
					
						 		
					markList[idx]=Double.parseDouble(values[2]);
					idx++;
			
			
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Arrays.sort(markList);
		
		return markList[markList.length-1];
	}
	
	public boolean writeToTextFile(Object obj,File file) {
		
		boolean result = false;
		try(PrintWriter writer = 
				 new PrintWriter(new FileWriter(file, true))){
			
			writer.println(obj);
			
			result =true;
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public Book[] readFromTextFile(File file) throws IOException {
		
		Book[] bookList = new Book[2];
		
		String line =null;

		BufferedReader reader = new BufferedReader(new FileReader(file));
		int idx = 0;
		while( (line= reader.readLine())!=null) {
			
			String[] values = line.split(",");
			
		
			Book book =
					new Book(Integer.parseInt(values[0]),
							  values[1],values[2],
							  Double.parseDouble(values[3]));
			
			bookList[idx]=book;
			idx++;
		}
		
		reader.close();
		
		return bookList;
	}
	
	public boolean serialize(Book book,File file) {
		
		boolean result = false;
		
		ObjectOutputStream outStream =null;

		try {

			outStream =
					new ObjectOutputStream(new FileOutputStream(file));
			outStream.writeObject(book);
			result = true;
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				outStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
		
	}
	
	public Book deserliaze(File file) {
		
		Book book = null;
		
		try(ObjectInputStream inStream = 
				new ObjectInputStream(new FileInputStream(file))){
			
			book = (Book)inStream.readObject();
			
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return book;
	}
}