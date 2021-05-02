package br.sc.rafael.arraymatrizes.application;

import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.arraymatrizes.entities.ArrayProduct;

public class ArrayProductProgram {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayProduct[] array = new ArrayProduct[n];
		// vect.lenght = tamanho do array, ou seja, n.
		for (int i = 0; i < array.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			array[i] = new ArrayProduct(name, price);
		}

		double sum = 0.0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i].getPrice();
		}
		double avg = sum / array.length;

		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();
	}

}
