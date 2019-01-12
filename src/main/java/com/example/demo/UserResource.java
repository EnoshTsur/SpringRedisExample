package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	@RequestMapping(value = "/add/{id}/{name}" , method = RequestMethod.POST)
	public Optional<User> add(@PathVariable("id") final String id,
					@PathVariable("name") final String name) {
		userRepository.save(new User(id, name, 12000L));
		return userRepository.findById(id);
	}
	
	@RequestMapping(value = "/update/{id}/{name}" , method = RequestMethod.PUT)
	public Optional<User> update(@PathVariable("id") final String id,
					@PathVariable("name") final String name) {
		userRepository.save(new User(id, name, 12000L));
		return userRepository.findById(id);
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	

}
