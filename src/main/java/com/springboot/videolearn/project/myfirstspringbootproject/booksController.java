package com.springboot.videolearn.project.myfirstspringbootproject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class booksController {
	@GetMapping("/books")
	public List<books> getAllBooks() {
		return Arrays.asList(new books(1l,"My biography", "Mayank Verma", "Rs.200"));
	}
}
