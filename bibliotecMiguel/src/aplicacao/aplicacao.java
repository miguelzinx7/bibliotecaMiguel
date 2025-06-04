package aplicacao;

import java.util.Scanner;
import modelo.usuario;
import controle.blibioteca;
import controle.emprestimos;
import controle.usuarios;
import modelo.livro;

public class aplicacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte n;

        do {
            print_menu();
            try {
                n = Byte.parseByte(teclado.nextLine());

                switch (n) {
                	case 1:
	                    System.out.print("Titulo: ");
	                    String titulo = teclado.nextLine();
	
	                    System.out.print("Autor: ");
	                    String autor = teclado.nextLine();
	
	                    System.out.print("Editora: ");
	                    String editora = teclado.nextLine();
	
	                    System.out.print("Ano: ");
	                    int ano = Integer.parseInt(teclado.nextLine());
	
	                    System.out.print("Quantidade de exemplares: ");
	                    int quantidade = Integer.parseInt(teclado.nextLine());
	
	                    for (int i = 0; i < quantidade; i++) {
	                        System.out.print("ISBN do exemplar " + (i + 1) + ": ");
	                        int isbn = Integer.parseInt(teclado.nextLine());
	
	                        livro novoLivro = new livro(titulo, autor, editora, isbn, ano, 1);
	                        blibioteca.adicionarLivro(novoLivro);
	                    }
                    break;


                    case 2:
                        System.out.print("Informe o ISBN do livro para remover: ");
                        int isbnRemover = Integer.parseInt(teclado.nextLine());
                        blibioteca.removerLivro(isbnRemover);
                        break;

                    case 3:
                        blibioteca.listarLivros();
                        break;

                    case 4:
                        System.out.print("Informe o autor: ");
                        String autorBusca = teclado.nextLine();
                        blibioteca.buscarLivrosPorAutor(autorBusca);
                        break;
                        
                    case 5:
                        System.out.print("Nome: ");
                        String nome = teclado.nextLine();

                        System.out.print("CPF (apenas numeros): ");
                        int cpf = Integer.parseInt(teclado.nextLine());

                        System.out.print("Email: ");
                        String email = teclado.nextLine();

                        usuario novoUsuario = new usuario(nome, cpf, email);
                        usuarios.adicionarUsuario(novoUsuario);
                        break;

                    case 6:
                        System.out.print("Informe o CPF do usuario para remover: ");
                        int cpfRemover = Integer.parseInt(teclado.nextLine());
                        usuarios.removerUsuario(cpfRemover);
                        break;

                    case 7:
                        usuarios.listarUsuarios();
                        break;
                        
                    case 8:
                        System.out.print("CPF do usuario: ");
                        int cpfEmp = Integer.parseInt(teclado.nextLine());
                        System.out.print("ISBN do livro: ");
                        int isbnEmp = Integer.parseInt(teclado.nextLine());
                        emprestimos.emprestarLivro(cpfEmp, isbnEmp);
                        break;

                    case 9:
                        System.out.print("CPF do usuario: ");
                        int cpfDev = Integer.parseInt(teclado.nextLine());
                        System.out.print("ISBN do livro: ");
                        int isbnDev = Integer.parseInt(teclado.nextLine());
                        emprestimos.devolverLivro(cpfDev, isbnDev);
                        break;

                    case 10:
                        emprestimos.listarEmprestimos();
                        break;


                        
                        

                    case 0:
                        System.out.println("‹ Encerrando o programa...");
                        break;

                    default:
                        System.out.println("Opção invalida .");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro na entrada. Tente novamente.");
                n = -1; // mantÃ©m no loop
            }

        } while (n != 0);

        teclado.close();
    }

    public static void print_menu() {
        String menu = "\n MENU - BIBLIOTECA \n";
        menu += "1 - Adicionar livro\n";
        menu += "2 - Remover livro\n";
        menu += "3 - Listar livros\n";
        menu += "4 - Buscar livro por autor\n";
        menu += "5 - Adicionar usuario\n";
        menu += "6 - Remover usuario\n";
        menu += "7 - Listar usuarios\n";
        menu += "8 - Emprestar livro\n";
        menu += "9 - Devolver livro\n";
        menu += "10 - Listar emprestimos\n";
        menu += "0 - Sair\n";
        menu += "Escolha uma opção: ";
        System.out.print(menu);
    }


}
