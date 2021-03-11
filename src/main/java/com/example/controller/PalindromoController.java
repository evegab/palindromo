package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<PalindromoModel> postResponseJsonContent(@RequestBody PalindromoModel palindromo) {
		String response = PalindromoService.getLargetsPalindrome(palindromo.getPalindromo());
		//TODO 
		//verificar que no sea vacía (responder con error)
		if(!palindromo.getPalindromo().equals(""))
		    return new ResponseEntity<>(new PalindromoModel(response), HttpStatus.OK);
		else
		    return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		
	   // return new PalindromoModel(response);
	}
}
 