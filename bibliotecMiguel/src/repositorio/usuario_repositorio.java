package repositorio;

import java.util.HashMap;
import java.util.Map;
import modelo.usuario;

public class usuario_repositorio {
    private static Map<Integer, usuario> usuarios = new HashMap<>();

    public static void adicionarUsuario(usuario u) {
        if (usuarios.containsKey(u.getCpf())) {
            System.out.println("⚠️ Usuário já cadastrado.");
        } else {
            usuarios.put(u.getCpf(), u);
            System.out.println("✅ Usuário adicionado.");
        }
    }

    public static void removerUsuario(int cpf) {
        if (usuarios.remove(cpf) != null) {
            System.out.println("🗑️ Usuário removido.");
        } else {
            System.out.println("❌ CPF não encontrado.");
        }
    }

    public static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("📭 Nenhum usuário cadastrado.");
        } else {
            for (usuario u : usuarios.values()) {
                System.out.println(u);
            }
        }
    }
}
