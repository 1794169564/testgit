package com.z.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.z.entity.User;

public interface UserService {
	public User queryUser(@Param(value = "id") int id);

	public List<User> queryUserAll();

	public int deleteUser(@Param(value = "id") int id);

	public int updateUser(User user);
	
	public int insertUser(User user);
}
