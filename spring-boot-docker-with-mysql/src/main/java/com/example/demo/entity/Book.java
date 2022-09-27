package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="book")
@Entity
public class Book {

	@Id
	private int id;
	
	private String author;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String author) {
		super();
		this.id = id;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + "]";
	}
	
}
