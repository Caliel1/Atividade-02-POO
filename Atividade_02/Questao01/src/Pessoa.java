public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa (String nome, int idade){
        this.nome= nome;
        this.idade= idade;
    }

     public void imprimirDetalhes(){
        System.out.println("Ola " + nome + " você tem " + idade + " anos");
     }
    
}