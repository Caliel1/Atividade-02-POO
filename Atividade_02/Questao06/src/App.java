public class App {
    public static void main(String[] args) throws Exception {
         Biblioteca biblioteca = new Biblioteca(5);

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling");
        Livro livro3 = new Livro("O Código da Vinci", "Dan Brown");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("Livros cadastrados:");
        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("O Senhor dos Anéis");

        System.out.println("\nLivros após empréstimo:");
        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("O Senhor dos Anéis");

        System.out.println("\nLivros após devolução:");
        biblioteca.mostrarLivros();
    }
}
