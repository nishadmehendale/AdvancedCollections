package com.collection.employee;

//b.	MMASaving Account class will have fields accountID, accountholder_name, account_balance, isSalaryAccount
//		with that they will have setter and getter methods

public class MMSavingAcc {
	private int accountID;
	private String accountHolder;
	private double accountBalance;
	private boolean salaryAccount;
	
	public MMSavingAcc(int accountID, String accountHolder, double accountBalance, boolean salaryAccount) {
		this.accountID = accountID;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.salaryAccount = salaryAccount;
	}
	
	
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public boolean isSalaryAccount() {
		return salaryAccount;
	}
	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}


	@Override
	public String toString() {
		return "MMSavingAcc [accountID=" + accountID + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + ", salaryAccount=" + salaryAccount + "]";
	}
	
}
