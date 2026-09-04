/*
 * Classe Pessoa:
 * Representa uma pessoa que possui nome e um Endereco.
 * Note que um dos atributos é um OBJETO de outra classe (Endereco).
 * Isso mostra uma relação "tem-um": toda Pessoa tem um Endereco.
 */
public class Pessoa {

    // Atributos encapsulados (private).
    private String nome;
    private Endereco endereco; // composição por referência: a Pessoa contém um Endereco

    /*
     * Construtor que recebe nome e o Endereco já criado.
     * A Pessoa não cria o Endereco internamente aqui; quem o cria é
     * o código que chama o construtor (no nosso caso, a Empresa).
     */
    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /*
     * Mostra o nome da pessoa junto de seu endereço completo.
     * Reaproveita o método enderecoCompleto() da classe Endereco:
     * cada objeto cuida do que sabe fazer.
     */
    public String dadosCompletos() {
        return nome + " | " + endereco.enderecoCompleto();
    }
}
