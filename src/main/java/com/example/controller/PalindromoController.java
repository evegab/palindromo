package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.PalindromoModel;
import com.example.service.PalindromoService;

@RestController
@RequestMapping("/palindromo")
public class PalindromoController {
	@GetMapping
	public String greeting() {
		return "detectar palindromo";
	}
	@PostMapping(consumes="application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public PalindromoModel postResponseJsonContent(@RequestBody PalindromoModel palindromo) {
		
	    return new PalindromoModel(PalindromoService.getLargetsPalindrome(palindromo.getPalindromo()));
	}
}
