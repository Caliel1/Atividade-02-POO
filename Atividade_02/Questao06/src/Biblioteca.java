public class Biblioteca {
    private Livro[] livros;
    private int tamanho;
    private int contador;

    public Biblioteca(int tamanho){
        this.livros= new Livro[tamanho];
        this.tamanho= tamanho;
        this.contador= 0;
    }

    public void adicionarLivro(Livro livro){
        if (contador < tamanho) {
            this.livros[contador]= livro;
            contador++;
            System.out.println("Livro " + livro.getTitulo() +" adicionado com sucesso.");
        }else{
            System.out.println("Blibioteca cheia não é possivel adicionar mais livros.");
        }
    }

    public void emprestarLivro(String titulo){
        for (int i = 0; i < contador; i++){
            if (livros[i].getTitulo().equals(titulo)){
                livros[i].emprestar();
                return;
            }
        }
        System.out.println("Livro " + titulo +" adicionado com sucesso.");
    }

    public void devolverLivro(String titulo){
        for (int i = 0; i < contador; i++){
            if (livros[i].getTitulo().equals(titulo)){
                livros[i].devolver();
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado na biblioteca.");
    }

    public void mostrarLivros() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Título: " + livros[i].getTitulo() + ", Disponível: " + (livros[i].isDisponivel() ? "Sim" : "Não"));
        }
    }
}
