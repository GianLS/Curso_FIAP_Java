package br.com.fiap.banco;
/**
 * Classe que abstrai uma Conta Bancária
 * @author gianleite
 * @version 1.0
 */
public abstract class Conta {
	/**
	 * Número da conta
	 */
	private int numero;

	/**
	 * Número da Agência
	 */
	private int agencia;

	/**
	 * Saldo da Conta
	 */
	private double saldo;

	/**
	 * Construtor padrão
	 */
	public Conta(){

	}

	/**
	 * Construtor que recebe o número da conta, agência e saldo
	 * @param numero Número da Conta
	 * @param agencia Número da Agência
	 * @param saldo Saldo da Conta
	 */
	public Conta(int numero, int agencia, double saldo){
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.depositar(saldo);
	}

	/**
	 * Deposita um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	 */
	public void depositar(double valor){
		if (valor < 0){
			throw new IllegalArgumentException();
		}
		saldo = saldo + valor;
	}

	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	public void retirar(double valor) throws Exception{
		if (valor > saldo){
			throw new Exception("Saldo insuficiente");
		}
		saldo = saldo - valor;
	}

	/**
	 * Retorna o Número da Conta
	 * @return Número da Conta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Atribui o Número da Conta
	 * @param numero Número da Conta a ser atribuído
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Retorna o número da Número da Agência
	 * @return Número da Agência
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Atribui o Número da Agência
	 * @param agencia Número da Agência a ser atribuído na conta
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Retorna o Saldo da Conta
	 * @return Saldo da Conta
	 */
	public double getSaldo() {
		return saldo;
	}
}