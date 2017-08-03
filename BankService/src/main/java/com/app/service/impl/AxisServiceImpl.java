package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.axis.AxisAcc;
import com.app.dao.IAxisDao;
import com.app.service.IAxisService;

@Service
public class AxisServiceImpl implements IAxisService {

	@Autowired
	private IAxisDao dao;
	
	public int createAccount(AxisAcc acc) {
		return dao.createAccount(acc);
	}
	public List<AxisAcc> viewAllAccounts() {
		return dao.viewAllAccounts();
	}
	public AxisAcc getAccountDetails(int accNo) {
		return dao.getAccountDetails(accNo);
	}
	public void updateAccount(AxisAcc acc) {
		dao.updateAccount(acc);	
	}
	public boolean checkBalance(long cardNo){
		return dao.checkBalance(cardNo);
	}
}
