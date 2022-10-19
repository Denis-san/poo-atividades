package pooAtividades.exceptions;

public class Conta {
	private String numero;
	private double saldo;

	public Conta(String numero) {
		this.numero = numero;
		this.saldo = 0;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo = getSaldo() + valor;
	}

	
	@Override
	public String toString() {
		return "Conta: \nnumero: " + numero + "\nsaldo: " + saldo;
	}
}