package br.sc.rafael.secao14.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.secao14.entities.Company;
import br.sc.rafael.secao14.entities.Individual;
import br.sc.rafael.secao14.entities.TaxPayer;

public class TaxPayerProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income:");
			Double anualIncome = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures:");
				Double healthExpenditures = sc.nextDouble();
				Individual individual = new Individual(name, anualIncome, healthExpenditures);
				list.add(individual);
			}
			else {
				System.out.print("Number of employees:");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0;
		
		for (TaxPayer tax: list) {
			System.out.println(tax.toString());
			sum = sum + tax.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum ));
		
		sc.close();

	}

}
