package br.sc.rafael.arraymatrizes.application;

import java.util.Locale;
import java.util.Scanner;
/* Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.*/
public class SomarListaArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma = soma + vect[i];
		}
		
		double avg = soma / n;
		
		System.out.printf("média = %.2f%n", avg);
		
		sc.close();
	}

}
