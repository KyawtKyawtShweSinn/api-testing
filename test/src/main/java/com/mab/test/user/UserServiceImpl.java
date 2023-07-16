package com.mab.test.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public List<User> showAllUser() {
		return userMapper.showAllUser();
	}

	@Override
	public User selectUserById(int id) {
		return userMapper.selectUserById(id);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public void deleteUser(int id) {
		userMapper.deleteUser(id);
	}
}