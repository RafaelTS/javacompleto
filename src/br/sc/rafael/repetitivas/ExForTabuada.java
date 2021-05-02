package br.sc.rafael.repetitivas;

import java.util.Scanner;

public class ExForTabuada {
	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int resultado = 0;

		for (int i = 1; i <= 10; i++) {
			resultado = i * x;
			System.out.println(i + " x " + x + " = " + resultado);
		}

		sc.close();
	}
}
