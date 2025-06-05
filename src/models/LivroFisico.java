package models;

public class LivroFisico extends Livro {

    private Integer nPaginas;

    public Integer getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(Integer nPaginas) {
        this.nPaginas = nPaginas;
    }

    public LivroFisico(String titulo, Integer anoPublicacao, Autor autor, int nPaginas) {
        super(titulo, anoPublicacao, autor);
        this.nPaginas = nPaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("");
        System.out.println(nPaginas + " paginas");
        System.out.println(getTitulo());
        System.out.println(getAnoPublicacao());
        System.out.println(getAutor().getNome());
        System.out.println(getAutor().getNacionalidade());
    }

}
