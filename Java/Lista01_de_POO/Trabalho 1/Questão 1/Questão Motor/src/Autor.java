/**
 * A classe 'Autor' representa um autor de livros.
 * Em Java, uma 'classe' é como um molde ou modelo para criar objetos.
 */
public class Autor {
    // Atributos: São as características do objeto. 
    // Usamos 'String' para textos.
    public String nome;
    public String nacionalidade;

    /**
     * O 'Construtor' é um método especial que é chamado quando criamos um novo objeto.
     * Ele serve para inicializar os atributos da classe.
     */
    public Autor(String nome, String nacionalidade) {
        // 'this' refere-se ao atributo da própria classe, 
        // evitando confusão com o parâmetro do método.
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
}
