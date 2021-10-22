package br.sc.rafael.repetitivas;

import java.util.Scanner;

public class ExForSomaMostraImparesEntreValores {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int resultado = 0;

		int min, max;
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}

		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				resultado = resultado + i;
				
			}
		}
		System.out.println(resultado);

		sc.close();
	}

}
