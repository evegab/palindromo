package com.example.model;

public class AuthResponse {
	private final String token;

	public AuthResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
