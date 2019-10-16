package com.example.SpringContext;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello() {
		System.out.println("Entrei em hello na classe MyController");
		return "Olá mundo!!!!";
	}
}
