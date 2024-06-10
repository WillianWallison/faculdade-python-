public class Livro {
    // Atributos
    private int identificador;
    private String tituloLivro;
    private String autorLivro;
    private int anoDePublicacao;
    private static int contadorLivros = 0;

    // Construtor
    public Livro(String tituloLivro, String autorLivro, int anoDePublicacao) {
        this.tituloLivro = tituloLivro.toUpperCase();
        this.autorLivro = autorLivro;
        this.anoDePublicacao = anoDePublicacao;
        this.identificador = ++contadorLivros;
    }

    // Getters e Setters
    public int getIdentificador() {
        return identificador;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Livro [id=" + identificador + ", titulo=" + tituloLivro + ", autor=" + autorLivro + ", anoPublicacao=" + anoDePublicacao + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return identificador == livro.identificador;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(identificador);
    }
}
