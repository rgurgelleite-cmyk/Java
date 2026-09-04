/*
 * Classe Endereco:
 * Representa o endereço de uma pessoa.
 * É um exemplo de classe simples que apenas guarda informações (atributos)
 * e permite acessá-las por meio de métodos.
 *
 * Em POO, uma "classe" funciona como um molde/planta: define quais
 * informações um objeto desse tipo terá e quais operações poderá realizar.
 */
public class Endereco {

    // Atributos (características) do endereço.
    // São 'private' para garantir encapsulamento: ninguém de fora altera
    // diretamente; o acesso é feito pelos métodos get e set abaixo.
    private String rua;
    private int numero;
    private String cidade;

    /*
     * Construtor da classe.
     * É chamado quando fazemos: new Endereco(...)
     * Serve para inicializar o objeto já com seus valores obrigatórios.
     * Como todo endereço precisa de rua, número e cidade, exigimos
     * esses dados no momento da criação.
     */
    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;           // 'this' diferencia o atributo da classe do parâmetro
        this.numero = numero;
        this.cidade = cidade;
    }

    // Métodos 'get' retornam o valor de um atributo privado.
    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    // Métodos 'set' permitem alterar o valor de um atributo privado.
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /*
     * Monta uma string legível com o endereço completo.
     * Útil para exibir as informações de forma organizada.
     */
    public String enderecoCompleto() {
        return rua + ", nº " + numero + " - " + cidade;
    }
}
