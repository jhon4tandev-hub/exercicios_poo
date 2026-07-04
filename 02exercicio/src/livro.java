public class livro {

    private String titulo;
    private String autor;
    private int paginas;
    private boolean disponivel = true;

    public void emprestar() {
        if (disponivel)
            disponivel = false;
    }

    public void devolver() {
        if (!disponivel)
            disponivel = true;
    }


}
