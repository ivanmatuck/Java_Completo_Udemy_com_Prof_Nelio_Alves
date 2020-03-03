package entities;

public class Account {
	
	private int conta;
	private String nome;
	private double saldo;
	
	public Account(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public Account(int conta, String nome, double initialDeposit) {
		this.conta = conta;
		this.nome = nome;
		deposit(initialDeposit);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double amount) {
		saldo += amount;
	}
	
	public void whithdraw(double amount) {
		saldo -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ conta
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
}
