package br.sc.rafael.condicionais;

import java.util.Scanner;

/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
 * uma duração mínima de 1 hora e máxima de 24 horas.*/

public class Ex4TempoJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tempo1 = sc.nextInt();
		int tempo2 = sc.nextInt();
		int resultado;

		if (tempo1 < tempo2) {
			resultado = tempo2 - tempo1;
			
		} else {
			resultado = 24 - tempo1 + tempo2;
			
		}
		System.out.println("O tempo do jogo é: " + resultado + " horas");

		sc.close();
	}

}
