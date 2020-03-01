package com.springboot.videolearn.project.myfirstspringbootproject;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class booksController {
	@GetMapping("/books")
	public List<books> getAllBooks() {
		return Arrays.asList(new books(1l,"My biography", "Mayank Verma", "Rs.200"));
	}
	@GetMapping("/newbooks")
	public List<books> getAllBooks2() {
		List<books> temp = new ArrayList<books>();
		Random rand = new Random();
		int token = userInput.User();
		int ran = rand.nextInt(10);
		if(ran == token) {
		if(ran>7)
		temp.add(new books(2l,"Other's biography", "Vineet Kumar", "Rs.400"));
		else if(ran>3 && ran<7)
		temp.add(new books(3l,"Hello Spring","Vivek Mall","Rs.500"));
		else
		temp.add(new books(4l,"Spring Advance","Mayank Verma","Rs.1000"));
		}else
			temp.add(new books(0l,null,null,null));
		System.out.println("Lucky number for this time is :"+ran+" Please visit URL for results!");
		return temp;
	}
}
