package br.sc.rafael.repetitivas;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class ExFor4DivisaoDoisNumeros {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num2 == 0) {
				System.out.println("Divis�o imposs�vel");
			} else {

				double divisao = (double) num1 / num2;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();
	}

}
