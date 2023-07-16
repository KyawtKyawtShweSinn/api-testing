package com.mab.test.user;

import java.util.List;

public interface UserService {

	public void insertUser(User user);

	public List<User> showAllUser();

	public User selectUserById(int id);

	public void updateUser(User user);

	public void deleteUser(int id);
}