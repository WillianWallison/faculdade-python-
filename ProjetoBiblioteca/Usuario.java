
public class Usuario {
    private int identificacao;
    private String nomeUsuario;
    private String emailUsuario;
    private static int contadorUsuarios = 0;

    public Usuario(String nomeUsuario, String emailUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.identificacao = ++contadorUsuarios;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + identificacao + ", nome=" + nomeUsuario + ", email=" + emailUsuario + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return identificacao == usuario.identificacao;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(identificacao);
    }
}
