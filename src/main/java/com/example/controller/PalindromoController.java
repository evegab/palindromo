package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palindromo")
public class PalindromoController {
	@GetMapping
	public String greeting() {
		return "detectar palindromo";
	}

}
