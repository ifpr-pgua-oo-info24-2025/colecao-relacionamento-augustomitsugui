package models;

public class LivroDigital extends Livro {

    private double tamanhoMB;

    public LivroDigital(String titulo, Integer anoPublicacao, Autor autor, double tamanhoMB) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoMB = tamanhoMB;
    }

    public double gettamanhoMB() {
        return tamanhoMB;
    }

    public void settamanhoMB(double tamanhoMB) {
        this.tamanhoMB = tamanhoMB;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("");
        System.out.println(tamanhoMB + " MB");
        System.out.println(getTitulo());
        System.out.println(getAnoPublicacao());
        System.out.println(getAutor().getNome());
        System.out.println(getAutor().getNacionalidade());
    }

}
