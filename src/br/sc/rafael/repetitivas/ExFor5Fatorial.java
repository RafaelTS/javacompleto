package br.sc.rafael.repetitivas;

import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por defini��o, fatorial de 0 � 1.
public class ExFor5Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int fatorial = 1;

		for (int i = 0; i < x; i++) {
			fatorial = fatorial * (x - i) * 1;

		}
		System.out.println(fatorial);

		sc.close();
	}

}
