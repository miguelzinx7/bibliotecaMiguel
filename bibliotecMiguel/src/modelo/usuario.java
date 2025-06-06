package modelo;

public class usuario {
	private String nome;
	private String cpf;
	private String email;
	public usuario(String nome, String cpf, String email) {
		
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
	}
	
	public String getCpf() {
	    return cpf;
	}

	@Override
	public String toString() {
		String relatorio = "\nNome: "+this.nome +" CPF:"+this.cpf +"EMAIL:"+ this.email;
		return relatorio;
	}
 
}
