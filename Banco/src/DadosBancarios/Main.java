package DadosBancarios;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Leonardo Lima", "13", 300.00);
		
		conta.exibirDados();
		
		conta.depositar(200);
		
		conta.sacar(100);
	
		conta.setTitular("Leonardo Ferreira");
		
		conta.exibirDados();
	}

}
