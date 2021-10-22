package br.sc.rafael.construtores.encapsulamento.entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	private static final double SAQUE = 5.00;
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
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
	
	public String toString() {
		return "Account " 
			+ number
			+ ", Holder: "
			+ holder
			+ ", Balance: $ "
			+ String.format("%.2f", balance)
			;
	}
	

	public void deposit(double amount) {
		this.balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		this.balance = balance - SAQUE - amount;
	}


}
