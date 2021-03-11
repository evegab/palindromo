package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.model.UserModel;
@Service
public class UserService implements UserDetailsService{
	private List<UserModel> userList;
	public UserService() {
		// TODO Auto-generated constructor stub
		this.userList = new ArrayList<UserModel>();
		UserModel user = new UserModel();
		user.setPassword("1234");
		user.setUser("edinson");
		this.userList.add(user);
		user.setPassword("12345");
		user.setUser("juan");
		this.userList.add(user);
		user.setPassword("12356");
		user.setUser("camila");
		this.userList.add(user);
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("recibido:" + username);
		System.out.println("ingresa method");
		UserModel user = findByName(username);
		System.out.println(user.getUser() +" "+ user.getPassword());
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		UserDetails userDetails = new User(user.getUser(), user.getPassword(), roles);
		return userDetails;
	}
	
	private UserModel findByName(String name) {
		System.out.println("ingrea a bucar user");
		System.out.println("user size" + this.userList.size());
		UserModel aux = null;
		for(int i = 0; i< this.userList.size(); i++) { 
			if(name.equals(this.userList.get(i).getUser()))
				System.out.println("ingresa al if");
				aux = this.userList.get(i);
		}
		return aux;
	}

}
