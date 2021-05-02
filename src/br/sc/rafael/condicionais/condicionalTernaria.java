package br.sc.rafael.condicionais;

public class condicionalTernaria {
	/*Condi��o tern�ria � uma maneira de "enxugar o c�digo"
		faz com que o if/else seja reduzido atrav�s da l�gica que ele propoe
		Sintax: (condi��o) ? valor-se-verdareiro : valor-se-falso
	Exemplo:
	(2 > 4) ? 50 : 80 (sa�da 80)
	(10 !=3 ) ? "Maria" :  "Alex" (sa�da Maria)
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
		System.out.println("Valor do desconto � R$: " + desconto);
		
	}

}
