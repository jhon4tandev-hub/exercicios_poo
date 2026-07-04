public class livro {

    private String titulo;
    private String autor;
    private int paginas;
    private boolean disponivel = true;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length() > 2)
            this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor.length() > 2)
            this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0)
            this.paginas = paginas;
    }

    public void emprestar() {
        if (disponivel)
            disponivel = false;
    }

    public void devolver() {
        if (!disponivel)
            disponivel = true;
    }


}
