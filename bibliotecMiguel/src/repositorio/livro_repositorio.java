package repositorio;

import java.util.HashMap;
import java.util.Map;
import modelo.livro;

public class livro_repositorio {
    private static Map<Integer, livro> livros = new HashMap<>();

    public static void adicionarLivro(livro l) {
        if (livros.containsKey(l.getIsbn())) {
            System.out.println(" Livro com ISBN já existe.");
        } else {
            livros.put(l.getIsbn(), l);
            System.out.println(" Livro adicionado.");
        }
    }

    public static void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("­ Nenhum livro cadastrado.");
        } else {
            for (livro l : livros.values()) {
                System.out.println(l);
            }
        }
    }

    public static livro consultarPorISBN(int isbn) {
        return livros.get(isbn);
    }

    public static void removerLivro(int isbn) {
        if (livros.remove(isbn) != null) {
            System.out.println("Livro removido.");
        } else {
            System.out.println("ISBN não encontrado.");
        }
    }

    public static void buscarPorAutor(String autor) {
        boolean achou = false;
        for (livro l : livros.values()) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(l);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum livro do autor: " + autor);
        }
    }
}