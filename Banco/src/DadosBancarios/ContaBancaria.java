package DadosBancarios;

public class ContaBancaria {
	private String titular;
	private String numeroConta;
	private double saldo;
	
	public ContaBancaria(String titular, String numeroConta, double saldo) {
	this.titular = titular;
	this.numeroConta = numeroConta;
	this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor de depósito inválido");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0) {
			saldo -= valor;
			System.out.println("O valor de " + valor + " foi sacado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

public String getTitular() {
	return titular;
}

public void setTitular (String titular) {
	this.titular = titular;
}

public String getNumeroConta() {
	return numeroConta;
}

public double getSaldo() {
	return saldo;
}

public void exibirDados() {
	System.out.println("----- Dados da Conta -----");
	System.out.println("Nome: " + titular);
	System.out.println("Numero da conta: " + numeroConta);
	System.out.println("Seu saldo é: R$" + saldo);
	}
}
