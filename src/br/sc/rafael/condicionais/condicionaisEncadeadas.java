package br.sc.rafael.condicionais;

import java.util.Scanner;

public class condicionaisEncadeadas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora: ");
		int hora = 0;
		if (hora < 12) {
			System.out.println("Bom dia");
		} 
		else if (hora < 18) 
			System.out.println("Boa tade");
		else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}
		
}
