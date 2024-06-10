import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Biblioteca {
    private LinkedList<Livro> colecaoDeLivros;

    public Biblioteca() {
        colecaoDeLivros = new LinkedList<>();
    }

    public void inserir(Livro livroAtual) {
        if (colecaoDeLivros.contains(livroAtual)) {
            System.out.println("Livro " + livroAtual + " duplicado");
        } else {
            colecaoDeLivros.add(livroAtual);
        }
    }

    public Livro buscar(int identificador) {
        for (Livro livroAtual : colecaoDeLivros) {
            if (livroAtual.getIdentificador() == identificador) {
                return livroAtual;
            }
        }
        return null;
    }

    public void remover(int identificador) {
        Livro livroAtual = buscar(identificador);
        if (livroAtual != null) {
            colecaoDeLivros.remove(livroAtual);
            System.out.println("Livro " + livroAtual + " removido");
        } else {
            System.out.println("Livro com id " + identificador + " não encontrado");
        }
    }

    public void listarTodos() {
        Collections.sort(colecaoDeLivros, (l1, l2) -> Integer.compare(l1.getIdentificador(), l2.getIdentificador()));
        for (Livro livroAtual : colecaoDeLivros) {
            System.out.println(livroAtual);
        }
    }
}
