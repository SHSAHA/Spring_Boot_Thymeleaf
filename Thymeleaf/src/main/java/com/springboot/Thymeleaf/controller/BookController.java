package com.springboot.Thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.model.Book;

@Controller
@RequestMapping("/books")
public class BookController {

	// load book data
	
	private List<Book> theBooks;
	
	@PostConstruct
	private void loadData() {
		
		// create books
		Book b1 = new Book(1, 1, "Effective Java", "Joshua Bloch", "978-0134685991");
		Book b2 = new Book(2, 2, "Java 9 for Programmers", "Harvey Deitel", "978-0134777566");
		Book b3 = new Book(3, 3, "Core Java SE 9", "Cay S. Horstmann", "978-0134694726");

		// create the list
		theBooks = new ArrayList<>();
		
		// add to the list
		theBooks.add(b1);
		theBooks.add(b2);
		theBooks.add(b3);
	
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listBooks(Model theModel) {
		
		// add to the spring model
		theModel.addAttribute("books", theBooks);
		
		return "list-books";
	}
}

