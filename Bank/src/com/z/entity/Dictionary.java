package com.z.entity;


import java.sql.Timestamp;

/**
 * 数据字典表
 * @author DELL
 *
 */
public class Dictionary {
	private int id;
	private String typeCode;
	private String typeName;
	private int valueId;
	private String valueName;
	private Timestamp createTime;
	public Dictionary() {
		super();
	}
	public Dictionary(int id, String typeCode, String typeName, int valueId,
			String valueName, Timestamp createTime) {
		super();
		this.id = id;
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.valueId = valueId;
		this.valueName = valueName;
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getValueId() {
		return valueId;
	}
	public void setValueId(int valueId) {
		this.valueId = valueId;
	}
	public String getValueName() {
		return valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
}
