package com.z.entity;

import java.sql.Timestamp;
/**
 * 后台用户表
 * @author DELL
 *
 */
public class Backend_User {
	private int id;
	private String name;
	private String password;
	private String type;
	private Timestamp createTime;
	private String typeName;
	public Backend_User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Backend_User(int id, String name, String password, String type,
			Timestamp createTime) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.type = type;
		this.createTime = createTime;
	}
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
}
