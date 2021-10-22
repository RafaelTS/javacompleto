package br.sc.rafael.arraymatrizes.application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizDiagonalPrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();

			}
		}

		System.out.println("Main Diagonal:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i] == mat[j]) {
					System.out.print(mat[i][j] + "");
				}
			}
		}
		
		int contador = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					contador++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers = " + contador);

		sc.close();
	}
}
