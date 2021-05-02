package br.sc.rafael.arraymatrizes.application;

import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.arraymatrizes.entities.Pensao;

public class PensaoProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pensao[] pensao = new Pensao[10];

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent # " + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			System.out.println();
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			pensao[room] = new Pensao(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < n; i++) {
			if (pensao[i] != null) {
				System.out.println(pensao[i]);
			}
		}
		
		sc.close();
	}

}
