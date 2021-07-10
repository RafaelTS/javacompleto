package br.sc.rafael.secao15.program;

import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.secao15.model.entities.Account;
import br.sc.rafael.secao15.model.exceptions.DomainException;

public class AccountProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			
			System.out.println("Number: " );
			int number = sc.nextInt();
			System.out.println("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.println("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.println("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.println("New balance: " + account.getBalance());
			
		}
	
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
