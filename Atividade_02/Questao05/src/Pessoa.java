public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade,Endereco endereco){
        this.nome= nome;
        this.idade= idade;
        setEndereco(endereco);
    }

    public void setEndereco(Endereco endereco){
        this.endereco= endereco;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Endereco:  rua " + endereco.getRua() + ", número " + endereco.getNumero());
    }
}
