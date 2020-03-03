package entities;

public class ProductsVetores_Ex {

	private String nome;
	private String email;

	public ProductsVetores_Ex(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.nome = email;
	}

	public String toString() {
		return nome + ", " + email;
	}
	
	
}
