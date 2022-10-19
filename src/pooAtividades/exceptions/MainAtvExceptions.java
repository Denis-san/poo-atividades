package pooAtividades.exceptions;

public class MainAtvExceptions {
	
	private static final int QNT_BANCO = 2;

	public static void main(String[] args) {
		
		Banco meuBanco = new Banco(QNT_BANCO);
		Conta conta1 = new Conta("1");
		//conta1.depositar(400.00);
		Conta conta2 = new Conta("2");
		
		meuBanco.add(conta1);
		meuBanco.add(conta2);
		
		
		try {
			meuBanco.debitar("1", 200.0, "2");
		} catch (ContaNaoEncontradaException | SaldoException e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
		//System.out.println(meuBanco.buscarContaPorNumero("2"));
		
	}

}
