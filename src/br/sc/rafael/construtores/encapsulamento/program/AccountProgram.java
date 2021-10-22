package br.sc.rafael.construtores.encapsulamento.program;

import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.construtores.encapsulamento.entities.Account;

public class AccountProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		Account account; 
		
		System.out.println("Is there na initial deposit (y/n)? ");
		
		String inicialDeposity = sc.nextLine();
//		char response = sc.next().charAt(0);
//		if(response == y)
		
		if (inicialDeposity.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(number, holder, balance);
			
		} 
		else {
			account = new Account(number, holder);
			
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(account);
		
		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println();
		System.out.println("Updated account data: "+ account);
		

		System.out.println("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println();
		System.out.println("Updated account data: " + account);
		
		
		sc.close();
	}

}
