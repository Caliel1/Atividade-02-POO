public class Carro {
    private String marca;
    private int ano;
    
    public void setMarca(String marca){
        this.marca= marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setAno(int ano){
        this.ano= ano;
    }

    public int getAno(){
        return ano;
    }

    public Carro (String marca, int ano){
        this.marca= marca;
        this.ano= ano;
    }

    public void imprimirDetalhes(){
        System.out.println("A marca é " + marca);
        System.out.println("O ano dele é " + ano);
    }
}
