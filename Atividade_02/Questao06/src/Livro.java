public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo= titulo;
        this.autor= autor;
        this.disponivel= true;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void emprestar(){
        if(disponivel){
            disponivel= false;
            System.out.println("Eu empresto o livro " + titulo);
        }else{
            System.out.println("O livro não está disponivel para emprestar.");
        }
    }

    public void devolver(){
        if (disponivel){
            disponivel= true;
            System.out.println("Obrigado por devolver o livro " + titulo);
        }else{
            System.out.println("O livro "+ titulo + " já está disponível.");
        }
    }


}
