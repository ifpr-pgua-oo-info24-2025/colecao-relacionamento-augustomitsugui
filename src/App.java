import java.util.ArrayList;
import models.*;

public class App {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Augusto MTS", "japones");
        Autor autor2 = new Autor("Shoyimi", "japones");

        LivroFisico lf1 = new LivroFisico("A menina que roubava livros", 2001, autor1, 102);
        LivroFisico lf2 = new LivroFisico("A magia do IOT", 2025, autor2, 102);

        LivroDigital ld1 = new LivroDigital("O Quinze", 1923, autor2, 123);
        LivroDigital ld2 = new LivroDigital("Anna Julia", 2412, autor1, 333);

        ArrayList<Livro> biblioteca = new ArrayList<>();
        biblioteca.add(lf1);
        biblioteca.add(lf2);
        biblioteca.add(ld1);
        biblioteca.add(ld2);

        for (int i = 0; i < biblioteca.size(); i++) {
            biblioteca.get(i).exibirDetalhes();
        }
    }
}
