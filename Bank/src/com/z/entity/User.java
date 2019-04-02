package com.z.entity;

import java.sql.Timestamp;

/**
 * 前台用户表
 * @author DELL
 *
 */
public class User {
	private int id;
	private String name;
	private int sex;
	private int age;
	private double money;
	private double regular;
	private String idCard;
	private String password;
	private int credit; //信用等级(外键)
	private String address;
	private int createBy;
	private Timestamp createTime;
	
	private String creditName;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, int sex, int age, double money,
			double regular, String idCard, String password, int credit,
			String address, int createBy, Timestamp createTime) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.money = money;
		this.regular = regular;
		this.idCard = idCard;
		this.password = password;
		this.credit = credit;
		this.address = address;
		this.createBy = createBy;
		this.createTime = createTime;
	}
	
	public String getCreditName() {
		return creditName;
	}

	public void setCreditName(String creditName) {
		this.creditName = creditName;
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

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getRegular() {
		return regular;
	}

	public void setRegular(double regular) {
		this.regular = regular;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreateBy() {
		return createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
}
