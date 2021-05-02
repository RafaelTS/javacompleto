package br.sc.rafael.repetitivas;

import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
//um valor por linha, inclusive o X, se for o caso.
public class Ex1ForImparesUmToX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			if (x % 2 != 0) {
				System.out.println(x);
			}
		}

		sc.close();
	}

}
