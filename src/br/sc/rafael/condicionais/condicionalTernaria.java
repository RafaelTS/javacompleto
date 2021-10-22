package br.sc.rafael.condicionais;

public class condicionalTernaria {
	/*Condição ternária é uma maneira de "enxugar o código"
		faz com que o if/else seja reduzido através da lógica que ele propoe
		Sintax: (condição) ? valor-se-verdareiro : valor-se-falso
	Exemplo:
	(2 > 4) ? 50 : 80 (saída 80)
	(10 !=3 ) ? "Maria" :  "Alex" (saída Maria)
	*/
	public static void main(String[] args) {
		double preco = 34.5;
		double desconto;
		//com if else
//		if (preco < 20.0) {
//			desconto = preco * 0.1;
//		}
//		else {
//			desconto = preco * 0.05;
//		}
		
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println("Valor do desconto é R$: " + desconto);
		
	}

}
