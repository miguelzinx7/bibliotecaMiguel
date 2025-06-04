package modelo;

public class emprestimo {
    private int cpfUsuario;
    private int isbnLivro;

    public emprestimo(int cpfUsuario, int isbnLivro) {
        this.cpfUsuario = cpfUsuario;
        this.isbnLivro = isbnLivro;
    }

    public int getCpfUsuario() {
        return cpfUsuario;
    }

    public int getIsbnLivro() {
        return isbnLivro;
    }

    @Override
    public String toString() {
        return "📚 Empréstimo -> CPF: " + cpfUsuario + ", ISBN: " + isbnLivro;
    }
}
