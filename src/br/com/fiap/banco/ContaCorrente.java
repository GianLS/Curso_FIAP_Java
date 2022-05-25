package br.com.fiap.banco;

/**
 * Classe filha de Conta que especifica uma Conta Corrente
 * @author gianleite
 * @version 1.0
 */
public class ContaCorrente extends Conta {
	/**
	 * Tipo da Conta Corrente
	 */
	private String tipo;

	/**
	 * Limite do Cheque Especial
	 */
	private double chequeEspecial;

	/**
	 * Construtor padrão
	 */
	public ContaCorrente(){
	}

	/**
	 * Construtor que recebe o tipo da conta corrente
	 * @param tipo Tipo da Conta Corrente
	 */
	public ContaCorrente(String tipo){
		this.tipo = tipo;
	}

	/**
	 * Construtor que recebe o número, agência, saldo e tipo da conta corrente
	 * @param numero Número da Conta
	 * @param agencia Número da Agência
	 * @param saldo Saldo da Conta
	 * @param tipo Tipo da Conta Corrente
	 */
	public ContaCorrente(int numero, int agencia, double saldo, String tipo){
		super(numero, agencia, saldo);
		this.tipo = tipo;
	}

	/**
	 * Retorna o Tipo da Conta Corrente
	 * @return Tipo da Conta Corrente
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Atribui o Tipo da Conta Corrente
	 * @param tipo Tipo da Conta Corrente a ser atribuído
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Retorna o Limite do Cheque Especial
	 * @return Limite do Cheque Especial
	 */
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	/**
	 * Atribui o Limite do Cheque Especial
	 * @param chequeEspecial Valor do Cheque Especial a ser atribuído
	 */
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	/**
	 * Retorna o Saldo Disponível, somando Saldo + Limite do Cheque Especial
	 * @return Limite do Cheque Especial
	 */
	public double getSaldoDisponivel(){
		return getSaldo() + this.chequeEspecial;
	}

	/**
	 * Retira um valor do saldo da conta corrente somando a taxa
	 * @param valor Valor a ser retirado
	 * @throws Exception 
	 */
	@Override
	public void retirar(double valor) throws Exception{
		valor += 10;
		if (valor > super.getSaldo()){
			throw new Exception("Saldo insuficiente");
		}
		super.retirar(valor);
	}

}