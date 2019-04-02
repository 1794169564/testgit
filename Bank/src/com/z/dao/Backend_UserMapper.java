package com.z.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.z.entity.Backend_User;

public interface Backend_UserMapper {
	public Backend_User findOneBackendUser(@Param(value="id")int id);
	
	public List<Backend_User> findBackendUserAll();
	
	public int deleteBackendUser(@Param(value="id")int id);
	
	public int updateBackendUser(Backend_User user);
	
	public int insertBackendUser(Backend_User user);
}
