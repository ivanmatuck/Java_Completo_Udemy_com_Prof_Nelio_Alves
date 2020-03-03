package entities;

public class Conta {
	
	private int conta;
	private String nome;
	private double saldo;
	
	public Conta(int conta, String nome, double saldo) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
