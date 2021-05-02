package br.sc.rafael.condicionais;

import java.util.Scanner;

public class Ex3Multtiplos {
	/*
	 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
	 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("multiplo");
		} else {
			System.out.println("N�o � multiplo");
		}

		sc.close();
	}

}
