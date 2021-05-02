package br.sc.rafael.repetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.  */

public class ExFor3MediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			double media1 = sc.nextDouble();
			double media2 = sc.nextDouble();
			double media3 = sc.nextDouble();
			
			double media = (media1 * 2.0 + media2 * 3.0 + media3 * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}

