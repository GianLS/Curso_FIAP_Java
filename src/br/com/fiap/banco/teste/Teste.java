package br.com.fiap.banco.teste;

import br.com.fiap.banco.Conta;
import br.com.fiap.banco.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.depositar(50);
		cc.setAgencia(123);
		cc.setNumero(321);
		cc.setChequeEspecial(300);

		System.out.println("CC Saldo: " + cc.getSaldo());
		System.out.println("CC Saldo + Limite: " + cc.getSaldoDisponivel());

		cc.depositar(1000);

		System.out.println("CC Saldo: " + cc.getSaldo());
		System.out.println("CC Saldo + Limite: " + cc.getSaldoDisponivel());
		
		try {
			cc.retirar(150);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("CC Saldo: " + cc.getSaldo());
		System.out.println("CC Saldo: " + cc.getSaldoDisponivel());
		
		Conta poupanca = new ContaCorrente(322,124,1500,"001");
		System.out.println("Poupança Saldo: " + poupanca.getSaldo());
		
		try {
			poupanca.retirar(1490);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Poupança Saldo: " + poupanca.getSaldo());
	}
}