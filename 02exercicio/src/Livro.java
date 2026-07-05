public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, int paginas) {
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
    }

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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel)
            disponivel = false;
    }

    public void devolver() {
        if (!disponivel)
            disponivel = true;
    }

    public void exibirDetalhes() {
        System.out.println("Título do livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de páginas: " + getPaginas());
        System.out.println("Está disponivel? " + isDisponivel());
    }


}
