package com.z.entity;

import com.sun.jmx.snmp.Timestamp;


/**
 * 消费记录表
 * @author DELL
 *
 */
public class Record {
	private int id;
	private int uid;//
	private double payMoney;
	private int type;//消费记录，转账记录,还款记录
	private String detail;
	private Timestamp createTime;
	
	private String uName;
	private String typeName;
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Record(int id, int uid, double payMoney, int type,
			String detail, Timestamp createTime) {
		super();
		this.id = id;
		this.uid = uid;
		this.payMoney = payMoney;
		this.type = type;
		this.detail = detail;
		this.createTime = createTime;
	}
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
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
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(double payMoney) {
		this.payMoney = payMoney;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
}
