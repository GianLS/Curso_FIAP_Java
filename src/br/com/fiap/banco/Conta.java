package br.com.fiap.banco;
/**
 * Classe que abstrai uma Conta Banc�ria
 * @author gianleite
 * @version 1.0
 */
public abstract class Conta {
	/**
	 * N�mero da conta
	 */
	private int numero;

	/**
	 * N�mero da Ag�ncia
	 */
	private int agencia;

	/**
	 * Saldo da Conta
	 */
	private double saldo;

	/**
	 * Construtor padr�o
	 */
	public Conta(){

	}

	/**
	 * Construtor que recebe o n�mero da conta, ag�ncia e saldo
	 * @param numero N�mero da Conta
	 * @param agencia N�mero da Ag�ncia
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
	 * Retorna o N�mero da Conta
	 * @return N�mero da Conta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Atribui o N�mero da Conta
	 * @param numero N�mero da Conta a ser atribu�do
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Retorna o n�mero da N�mero da Ag�ncia
	 * @return N�mero da Ag�ncia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Atribui o N�mero da Ag�ncia
	 * @param agencia N�mero da Ag�ncia a ser atribu�do na conta
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