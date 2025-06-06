package controle;

import modelo.usuario;
import repositorio.usuario_repositorio;

public class usuarios {

    public static void adicionarUsuario(usuario u) {
        usuario_repositorio.adicionarUsuario(u);
    }

    public static void removerUsuario(String cpf) {
        usuario_repositorio.removerUsuario(cpf);
    }

    public static void listarUsuarios() {
        usuario_repositorio.listarUsuarios();
    }
}
