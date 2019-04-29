package com.springboot.model;

public class Book {

	
	private int id;
	private int number;
	private String title;
	private String author;
	private String isbn;

	public Book() {
		
	}

	public Book(int id, int number, String title, String author, String isbn) {
		this.id = id;
		this.number = number;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", number=" + number + ", title=" + title + ", author=" + author + ", isbn=" + isbn
				+ "]";
	}


	
	
}
