public class App {
    public static void main(String[] args) throws Exception {
        Produtos p1 = new Produtos("Pudim", 25.99);
        Produtos p2 = new Produtos("Bolo", -30.99);

        p1.imprimirDados();
        p2.imprimirDados();
    }
}
