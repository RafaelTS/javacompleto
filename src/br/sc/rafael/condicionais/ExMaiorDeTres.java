package br.sc.rafael.condicionais;

import java.util.Scanner;

public class ExMaiorDeTres {
	//calcular o maior de 3 numeros
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("MAIOR = " + num1);
		}
		else if(num2 > num3) {
			System.out.println("MAIOR = " + num2);
		}
		else {
			System.out.println("MAIOR = " + num3);
		}
		
		sc.close();
	}

}
