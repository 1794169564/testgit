package com.z.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.z.dao.UserMapper;
import com.z.entity.User;
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper dao;
	
	@Override
	public User queryUser(int id) {
		return dao.queryUser(id);
	}

	@Override
	public List<User> queryUserAll() {
		return dao.queryUserAll();
	}

	@Override
	public int deleteUser(int id) {
		return dao.deleteUser(id);
	}

	@Override
	public int updateUser(User user) {
		return dao.updateUser(user);
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

}
