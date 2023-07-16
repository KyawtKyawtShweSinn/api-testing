package com.mab.test.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	// get all users
	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userService.showAllUser();
	}

	// get user by id rest api
	@GetMapping("/find/{id}")
	public User findUserById(@PathVariable Integer id) {
		User user = userService.selectUserById(id);
		return user;
	}
}