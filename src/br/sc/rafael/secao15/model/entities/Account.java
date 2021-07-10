package br.sc.rafael.secao15.model.entities;

import br.sc.rafael.secao15.model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
		
	}

	public Account() {
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		
		this.balance = balance - amount;
		
	}
	
	public String toString() {
		return "Account " 
			+ number
			+ ", Holder: "
			+ holder
			+ ", Balance: $ "
			+ String.format("%.2f", balance)
			;

	}

}
