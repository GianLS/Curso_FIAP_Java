package br.com.fiap.si;

public class Operadores {

	public static void main(String[] args) {
		int valorUm = 25;
		int valorDois = 18;
		int soma = valorUm + valorDois;
		int subtracao = valorUm - valorDois;
		int muliplicacao = valorUm * valorDois;
		int divisao = valorUm / valorDois;
		int mod = valorUm % valorDois;
		
		System.out.println("Valor 1 : " + valorUm);
		System.out.println("Valor 2 : " + valorDois);
		System.out.println("Adição : " + soma);
		System.out.println("Subtração : " + subtracao);
		System.out.println("Multiplicação : " + muliplicacao);
		System.out.println("Divisão : " + divisao);
		System.out.println("Resto : " + mod);
	}

}
