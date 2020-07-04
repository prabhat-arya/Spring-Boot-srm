package com.pi.beans;

public class Account {
	protected String accountHolder;
	protected long accountNumber;
	
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Account [accountHolder=" + accountHolder + ", accountNumber=" + accountNumber + "]";
	}
	
	

}
