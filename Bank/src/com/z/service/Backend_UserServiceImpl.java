package com.z.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.z.dao.Backend_UserMapper;
import com.z.entity.Backend_User;
@Service
public class Backend_UserServiceImpl implements Backend_UserService {

	@Resource
	private Backend_UserMapper dao;
	@Override
	public Backend_User findOneBackendUser(int id) {
		
		return dao.findOneBackendUser(id);
	}

	@Override
	public List<Backend_User> findBackendUserAll() {
		return dao.findBackendUserAll();
	}

	@Override
	public int deleteBackendUser(int id) {
		return dao.deleteBackendUser(id);
	}

	@Override
	public int updateBackendUser(Backend_User user) {
		return dao.updateBackendUser(user);
	}

	@Override
	public int insertBackendUser(Backend_User user) {
		// TODO Auto-generated method stub
		return dao.insertBackendUser(user);
	}

}
