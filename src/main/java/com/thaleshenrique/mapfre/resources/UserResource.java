package com.thaleshenrique.mapfre.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thaleshenrique.mapfre.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAll() 
	{
		User user = new User(1, "Thales");
		User user2 = new User(2, "Henrique");
		
		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user2);
		
		return users;
	}

}
