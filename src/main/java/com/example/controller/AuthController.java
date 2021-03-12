package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AuthRequest;
import com.example.model.AuthResponse;
import com.example.service.UserService;
import com.example.util.MyToken;

@RestController
public class AuthController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserService userService;
	@Autowired
	private MyToken jwt;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> createToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							authRequest.getUsername(), authRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("incorrect credentials", e);
		}
		final UserDetails userDetails = userService.loadUserByUsername(authRequest.getUsername());
		final String token = jwt.generateToken(userDetails);
		return ResponseEntity.ok(new AuthResponse(token));
	}
}
