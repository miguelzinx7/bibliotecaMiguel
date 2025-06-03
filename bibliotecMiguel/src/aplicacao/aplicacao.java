package aplicacao;
import modelo.usuario;
import controle.blibioteca;
import modelo.livro;

public class aplicacao {
	public static void main(String[] args) {
		usuario miguel = new usuario("Miguel", 123, "miguelbardales@gmail.com");
		livro harry = new livro("Harry","jussara", "combo",1,2,3);
		System.out.println(harry);
		System.out.println(miguel);
		
		livro l1 = new livro("A Hora da Estrela", "Clarice Lispector", "Rocco", 1111, 1977, 3);
        livro l2 = new livro("Dom Casmurro", "Machado de Assis", "Ática", 2222, 1899, 2);

        blibioteca.adicionarLivro(l1);
        blibioteca.adicionarLivro(l2);
        blibioteca.adicionarLivro(l1); // repetido

        blibioteca.listarLivros();

        blibioteca.consultarLivroPorISBN(1111);

        blibioteca.buscarLivrosPorAutor("Machado de Assis");

        blibioteca.removerLivro(2222);

        blibioteca.listarLivros();
	}

}
