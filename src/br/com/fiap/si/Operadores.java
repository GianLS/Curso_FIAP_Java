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
		System.out.println("Adi��o : " + soma);
		System.out.println("Subtra��o : " + subtracao);
		System.out.println("Multiplica��o : " + muliplicacao);
		System.out.println("Divis�o : " + divisao);
		System.out.println("Resto : " + mod);
	}

}
