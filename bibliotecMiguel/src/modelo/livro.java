package modelo;

public class livro {
	private String titulo;
	private String autor;
	private String editora;
	private int isbn;
	private int ano;
	private int quantidade;
	public livro(String titulo, String autor, String editora, int isbn, int ano, int quantidade) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
		this.ano = ano;
		this.quantidade = quantidade;
	}
	
	//Getters
	
	
	public String getTitulo() {
		return titulo;
	}
	public String getEditora() {
		return editora;
	}

	public int getIsbn() {
		return isbn;
	}

	public int getAno() {
		return ano;
	}
	// set qtd pois vai sofrer alteração
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getAutor() {
		return autor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	// 
	public String consultar_livro() {
		String consulta="\ntitulo,autor e qtd:"+getTitulo()+getAutor()+getQuantidade();
		return consulta;
	}
	
	@Override
	public String toString() {
		String relatorio ="\nTitulo"+this.titulo;
		relatorio += "\nISBN:"+this.isbn;
		return relatorio;
	}
	
	
	
	
	
	
	
	
	

}
