package br.com.fiap.banco;

public class ContaPoupanca extends Conta {
	private double rendimento;
	
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public double getSaldo() {
		return super.getSaldo() + rendimento;
	}
}