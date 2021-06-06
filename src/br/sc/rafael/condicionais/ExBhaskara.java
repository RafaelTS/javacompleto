package br.sc.rafael.condicionais;

import java.util.Locale;
import java.util.Scanner;

//Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de bhaskara. 
//Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente 
//"Imposs�vel calcular, caso haja uma divis�o por 0 ou raiz de n�mero negativo


public class ExBhaskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b -4.0 * a * c;
		
		if (a == 0 || delta < 0) {
			System.out.println("impossivel calcular");
		}
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R1 = %.5f%n", r2);
		}
		
		sc.close();
	}

}

