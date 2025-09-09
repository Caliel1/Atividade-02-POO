public class App {
    public static void main(String[] args) throws Exception {
        Endereco en1 = new Endereco("Amigo", 14);
        Endereco en2 = new Endereco("Pão", 15);

        Pessoa p1 = new Pessoa("Caliel", 19,en1);
        Pessoa p2 = new Pessoa("Jazz", 80,en2);

        p1.mostrarDados();
        p2.mostrarDados();
    }
}
