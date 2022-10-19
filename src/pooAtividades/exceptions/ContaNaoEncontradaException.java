package pooAtividades.exceptions;

public class ContaNaoEncontradaException extends Exception {

	public ContaNaoEncontradaException(String numeroConta) {
		super("Conta inexistente: " + numeroConta);
	}
}
