package controle;

import modelo.emprestimo;
import repositorio.emprestimo_repositorio;

public class emprestimos {

    public static void emprestarLivro(int cpf, int isbn) {
        emprestimo e = new emprestimo(cpf, isbn);
        emprestimo_repositorio.emprestarLivro(e);
    }

    public static void devolverLivro(int cpf, int isbn) {
        emprestimo_repositorio.devolverLivro(cpf, isbn);
    }

    public static void listarEmprestimos() {
        emprestimo_repositorio.listarEmprestimos();
    }
}
