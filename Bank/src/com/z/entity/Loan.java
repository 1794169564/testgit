package com.z.entity;


/**
 * ����ȱ�
 * @author DELL
 *
 */
public class Loan {
	private int id;
	private int uid;
	private int loanType;//贷款类型
	private double money;
	private String repayment;//还款日期
	
	private String userName;
	private String loanTypeName;
	public Loan() {
		super();
	}
	public Loan(int id, int uid, int loanType, double money,
			String repayment) {
		super();
		this.id = id;
		this.uid = uid;
		this.loanType = loanType;
		this.money = money;
		this.repayment = repayment;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoanTypeName() {
		return loanTypeName;
	}
	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
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
	public int getLoanType() {
		return loanType;
	}
	public void setLoanType(int loanType) {
		this.loanType = loanType;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getRepayment() {
		return repayment;
	}
	public void setRepayment(String repayment) {
		this.repayment = repayment;
	}
	
}
