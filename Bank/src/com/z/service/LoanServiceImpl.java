package com.z.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.z.dao.LoanMapper;
import com.z.entity.Loan;
@Service
public class LoanServiceImpl implements LoanService {

	@Resource
	private LoanMapper dao;
	@Override
	public Loan queryLoan(int id) {
		return dao.queryLoan(id);
	}

	@Override
	public List<Loan> queryLoanAll() {
		// TODO Auto-generated method stub
		return dao.queryLoanAll();
	}

	@Override
	public int deleteLoan(int id) {
		// TODO Auto-generated method stub
		return dao.deleteLoan(id);
	}

	@Override
	public int updateLoan(Loan loan) {
		// TODO Auto-generated method stub
		return dao.updateLoan(loan);
	}

	@Override
	public int insertLoan(Loan loan) {
		// TODO Auto-generated method stub
		return dao.insertLoan(loan);
	}

}
