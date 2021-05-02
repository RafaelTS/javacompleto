package br.sc.rafael.repetitivas;

import java.util.Scanner;
//programa para ler dois numeros. Se o primeiro foi menor, imprima crescente, senão, imprima decrescente.
// Caso sejam iguals, encerrar o laço.

public class Ex2OrdemCrescenteDecrescente {
	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			
			if(x < y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("fim");
		sc.close();
	}

}
