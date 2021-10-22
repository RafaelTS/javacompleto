package br.sc.rafael.repetitivas;

import java.util.Scanner;

//Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
//Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
//essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

public class ExFor2IntervaloXYInOut {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int resultado = 0;
		int resultadoOut = 0;

		for (int i = 0; i < x; i++) {
			int n = sc.nextInt();

			if (n >= 10 && n <= 20) {
		
				resultado = resultado + 1;
			} 
			
			else {
				resultadoOut = resultadoOut + 1;
				
			}
		}
		System.out.println(resultado + " in");
		System.out.println(resultadoOut + " out");
	
		
		sc.close();
	}

}
