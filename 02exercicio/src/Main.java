//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("A abelha", "Jhonatan", 300);

        livro.exibirDetalhes();

        livro.emprestar();
        livro.exibirDetalhes();

        livro.devolver();
        livro.exibirDetalhes();

    }
}