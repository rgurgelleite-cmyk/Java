/**
 * A classe 'Livro' representa um livro.
 * Note que ela terá uma associação com a classe 'Autor'.
 */
public class Livro {
    // Atributos do livro
    public String titulo;
    public int anoPublicacao; // 'int' é usado para números inteiros.

    // Associação: Aqui dizemos que todo Livro tem um Autor.
    // Isso é a base da Orientação a Objetos: objetos que se relacionam.
    public Autor autor;

    /**
     * Construtor da classe Livro.
     */
    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor; // Associando o objeto Autor ao Livro.
    }
}
