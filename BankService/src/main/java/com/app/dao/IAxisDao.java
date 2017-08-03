package com.app.dao;

import java.util.List;

import com.app.axis.AxisAcc;

public interface IAxisDao {

	public int createAccount(AxisAcc acc);
	public List<AxisAcc> viewAllAccounts();
	public AxisAcc getAccountDetails(int accNo);
	public void updateAccount(AxisAcc acc);
	public boolean checkBalance(long cardNo);
}
