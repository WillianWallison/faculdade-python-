import java.util.LinkedList;
import java.util.Collections;

public class GerenciamentoUsuarios {
    private LinkedList<Usuario> listaUsuarios;

    public GerenciamentoUsuarios() {
        listaUsuarios = new LinkedList<>();
    }

    public void inserir(Usuario user) {
        if (listaUsuarios.contains(user)) {
            System.out.println("Usuário " + user + " duplicado");
        } else {
            listaUsuarios.add(user);
        }
    }

    public Usuario buscar(int identificacao) {
        for (Usuario user : listaUsuarios) {
            if (user.getId() == identificacao) {
                return user;
            }
        }
        return null;
    }

    public void remover(int identificacao) {
        Usuario user = buscar(identificacao);
        if (user != null) {
            listaUsuarios.remove(user);
            System.out.println("Usuário " + user + " removido");
        } else {
            System.out.println("Usuário com id " + identificacao + " não encontrado");
        }
    }

    public void listarTodos() {
        Collections.sort(listaUsuarios, (u1, u2) -> Integer.compare(u1.getId(), u2.getId()));
        for (Usuario user : listaUsuarios) {
            System.out.println(user);
        }
    }
}

