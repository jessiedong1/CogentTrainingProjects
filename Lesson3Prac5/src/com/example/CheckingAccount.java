package com.example;

public class CheckingAccount extends Account {
	private final double overDraftLimit;

	public CheckingAccount(double balance, double overDraftLimit) {
		super(balance);
		this.overDraftLimit = overDraftLimit;
		// TODO Auto-generated constructor stub
	}
	public CheckingAccount(double blance) {
		super(blance);
		this.overDraftLimit = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<= (this.overDraftLimit + super.getBalance())) {
			return true;
		}
		return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Checking Account";
	}

}
