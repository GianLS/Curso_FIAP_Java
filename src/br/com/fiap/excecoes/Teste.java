package br.com.fiap.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// Lê os dois números
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();
			// Realiza a divisão
			int divisao = numero1 / numero2;
			// Exibe o resultado
			System.out.println("O resultado é: " + divisao);
		} catch (ArithmeticException e) {
			System.err.println("Erro ao dividir!");
		} catch (InputMismatchException e) {
			System.err.println("Erro de entrada de dados!");
		} finally {
			System.out.println("Finalizando a execução do programa!");
			sc.close();
		}


		//		int[] array = new int[2];
		//
		//		try {
		//			//Tenta acessar uma posição inexistente do vetor
		//			array[2] = 10;
		//		} catch (ArrayIndexOutOfBoundsException e) {
		//			System.err.println("Mensagem de erro: " + e.getMessage());
		//			e.printStackTrace();
		//		}
	}

}
