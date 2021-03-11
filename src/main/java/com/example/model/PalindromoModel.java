package com.example.model;

import java.io.Serializable;

public class PalindromoModel implements Serializable{
	private static final long serialVersionUID = 213533265435622978L;
	private String palindromo;
	
	public PalindromoModel() {
	}
	public PalindromoModel(String palindromo) {
		this.palindromo = palindromo;
	}

	public String getPalindromo() {
		return palindromo;
	}

	public void setPalindromo(String palindromo) {
		this.palindromo = palindromo;
	}
	
}
