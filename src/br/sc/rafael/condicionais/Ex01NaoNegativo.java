package br.sc.rafael.condicionais;

import java.util.Scanner;

public class Ex01NaoNegativo {
	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero �
		// negativo ou n�o.
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}

		sc.close();
	}

}
