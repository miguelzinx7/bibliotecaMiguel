package modelo;

public class usuario {
	private String nome;
	private int cpf;
	private String email;
	public usuario(String nome, int cpf, String email) {
		
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
	}
	@Override
	public String toString() {
		String relatorio = "\nNome: "+this.nome + this.cpf + this.email;
		return relatorio;
	}
 
}
