package repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelo.emprestimo;

public class emprestimo_repositorio {
    private static List<emprestimo> emprestimos = new ArrayList<>();

    public static void emprestarLivro(emprestimo e) {
        emprestimos.add(e);
        System.out.println(" Livro emprestado com sucesso.");
    }

    public static void devolverLivro(int cpf, int isbn) {
        Iterator<emprestimo> iterator = emprestimos.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            emprestimo e = iterator.next();
            if (e.getCpfUsuario() == cpf && e.getIsbnLivro() == isbn) {
                iterator.remove();
                encontrado = true;
                System.out.println(" Livro devolvido com sucesso.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Emprestimo não encontrado.");
        }
    }

    public static void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("­ Nenhum emprestimo registrado.");
        } else {
            for (emprestimo e : emprestimos) {
                System.out.println(e);
            }
        }
    }
}
