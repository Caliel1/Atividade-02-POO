public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco){
        setNome(nome);
        setPreco(preco);
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        if (preco >= 0) {
        this.preco= preco;
    } else {
        System.out.println("Valor invalido");
    }
    }

    public double getPreco(){
        return preco;
    }

    public void imprimirDados(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
    }
}
