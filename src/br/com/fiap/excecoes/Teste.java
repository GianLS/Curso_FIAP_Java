package br.com.fiap.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// L� os dois n�meros
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();
			// Realiza a divis�o
			int divisao = numero1 / numero2;
			// Exibe o resultado
			System.out.println("O resultado �: " + divisao);
		} catch (ArithmeticException e) {
			System.err.println("Erro ao dividir!");
		} catch (InputMismatchException e) {
			System.err.println("Erro de entrada de dados!");
		} finally {
			System.out.println("Finalizando a execu��o do programa!");
			sc.close();
		}


		//		int[] array = new int[2];
		//
		//		try {
		//			//Tenta acessar uma posi��o inexistente do vetor
		//			array[2] = 10;
		//		} catch (ArrayIndexOutOfBoundsException e) {
		//			System.err.println("Mensagem de erro: " + e.getMessage());
		//			e.printStackTrace();
		//		}
	}

}
