package com.app.service;

import java.util.List;

import com.app.axis.AxisAcc;

public interface IAxisService {

	public int createAccount(AxisAcc acc);
	public List<AxisAcc> viewAllAccounts();
	public AxisAcc getAccountDetails(int accNo);
	public void updateAccount(AxisAcc acc);
	public boolean checkBalance(long cardNo);
}
