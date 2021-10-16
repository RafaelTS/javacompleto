package br.sc.rafael.secao19.program;

import java.util.Scanner;

import br.sc.rafael.secao19.services.PrintService;

public class PrintProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
				
		System.out.println("How many values?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		
		System.out.println(ps.first());
		sc.close();
		
	}

}
