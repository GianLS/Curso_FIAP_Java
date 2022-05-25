package br.com.fiap.si;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();

		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		sc.close();

		double imc = peso / (altura * altura);

		System.out.println("Seu IMC � " + imc);

		if (imc <= 18.5) {
			System.out.println("Voc� est� abaixo do peso!");
		}else if (imc >= 25) {
			System.out.println("Voc� est� acima do peso!");
		}else {
			System.out.println("Voc� est� na faixa de peso ideal!");
		}

	}

}
