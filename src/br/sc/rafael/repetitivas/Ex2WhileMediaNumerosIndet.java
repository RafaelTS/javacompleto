package br.sc.rafael.repetitivas;

import java.util.Scanner;

//pegar a soma dos numeros e imprimir a  m�dia. SE o nr for negativo, imprimir imposs�vel calcular
public class Ex2WhileMediaNumerosIndet {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		// double media = 0;
		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;

			idade = sc.nextInt();
		}
		if (cont > 0) {

			double media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
		}
		else System.out.println("impossivel calcular");

		sc.close();
	}

}
