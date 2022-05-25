package br.com.fiap.si;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int primeroNumero = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = sc.nextInt();
		
		int soma = primeroNumero + segundoNumero;

		// double preco = sc.nextDouble();
		System.out.println("A soma de " + primeroNumero + " e " + segundoNumero + " é igual a: " + soma);
		
		sc.close();
	}

}
