package br.sc.rafael.application;
/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
para ser respons�vel pelos c�lculos.*/

import static br.sc.rafael.util.CurrencyConverter.Converter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?: ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dollarQuantity = sc.nextDouble();
		
		double result = Converter(dollarPrice, dollarQuantity);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
				
		sc.close();
	}

}
