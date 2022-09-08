package com.training.entity;

import com.training.stereotypes.MyTable;

@MyTable(name = "lumen_book")
public class Book {

	@MyId(columnName="book_id")
	private int bookId;
	
}
