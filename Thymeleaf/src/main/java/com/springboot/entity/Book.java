package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book{

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="number")
	private int number;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="isbn")
	private String isbn;
	
	
		
	// define constructors
	
	public Book() {
		
	}



	public Book(int id, int number, String title, String author, String isbn) {
		this.id = id;
		this.number = number;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public Book( int number, String title, String author, String isbn) {
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

