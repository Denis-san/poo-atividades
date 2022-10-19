package pooAtividades.exceptions;

public class Banco {
	private Conta[] contas;
	private int prox;

	public Banco(int tam) {
		contas = new Conta[tam];
	}

	public void add(Conta c) {
		contas[prox++] = c;
	}

	public void depositar(String numero, double valor) {
		for (int i = 0; i < prox; i++) {
			if (contas[i].getNumero().equals(numero)) {
				contas[i].depositar(valor);
			}
		}
	}

	public Conta buscarContaPorNumero(String numero) {
		for (Conta conta : contas) {
			if (conta.getNumero().equals(numero)) {
				return conta;
			}
		}

		return null;
	}

	public void debitar(String numeroOrigem, double valor, String numeroDestino)
			throws ContaNaoEncontradaException, SaldoException {

		Conta conta = buscarContaPorNumero(numeroDestino);

		if (conta == null) {
			throw new ContaNaoEncontradaException(numeroDestino);
		}
		if (buscarContaPorNumero(numeroOrigem) == null) {
			throw new ContaNaoEncontradaException(numeroOrigem);
		}
		if (buscarContaPorNumero(numeroOrigem).getSaldo() < valor) {
			throw new SaldoException("Saldo insuficiente!");
		}

		conta.depositar(valor);

	}

}