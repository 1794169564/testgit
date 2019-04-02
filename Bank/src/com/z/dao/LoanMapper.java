package com.z.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.z.entity.Loan;

public interface LoanMapper {
	public Loan queryLoan(@Param(value = "id") int id);

	public List<Loan> queryLoanAll();

	public int deleteLoan(@Param(value = "id") int id);

	public int updateLoan(Loan loan);
	
	public int insertLoan(Loan loan);
}
