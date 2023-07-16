package com.mab.test.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	public void insertUser(User user);

	public List<User> showAllUser();

	public User selectUserById(int id);

	public void updateUser(User user);

	public boolean deleteUser(int id);
}