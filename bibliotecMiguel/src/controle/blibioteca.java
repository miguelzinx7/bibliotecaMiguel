package controle;

import modelo.livro;
import repositorio.livro_repositorio;

public class blibioteca {

    public static void adicionarLivro(livro l) {
    	livro_repositorio.adicionarLivro(l);
    }

    public static void listarLivros() {
    	livro_repositorio.listarLivros();
    }

    public static void consultarLivroPorISBN(int isbn) {
        livro l = livro_repositorio.consultarPorISBN(isbn);
        if (l != null) {
            System.out.println("🔍 Livro encontrado:");
            System.out.println(l);
        } else {
            System.out.println("❌ Livro não encontrado.");
        }
    }

    public static void removerLivro(int isbn) {
    	livro_repositorio.removerLivro(isbn);
    }

    public static void buscarLivrosPorAutor(String autor) {
    	livro_repositorio.buscarPorAutor(autor);
    }
}
