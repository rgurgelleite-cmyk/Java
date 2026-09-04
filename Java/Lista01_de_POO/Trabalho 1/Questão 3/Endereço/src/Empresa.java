import java.util.ArrayList;

/*
 * Classe Empresa:
 * Representa uma empresa que possui nome e uma lista de funcionários (Pessoa).
 *
 * Relação de COMPOSIÇÃO: a Empresa é responsável por criar e administrar
 * sua lista de Pessoas. Aqui, a Empresa expõe um método para adicionar
 * funcionários, e ela própria instancia os objetos Endereco e Pessoa
 * sempre que um novo funcionário é contratado.
 *
 * Observe que, ao instanciar um Endereco dentro do método adicionarFuncionario,
 * dizemos que a Empresa compõe esse Endereco: o endereço só existe
 * porque a Empresa o criou, vinculado a um de seus funcionários.
 */
public class Empresa {

    private String nome;
    // ArrayList é uma lista redimensionável da biblioteca padrão do Java.
    // Guardamos objetos do tipo Pessoa (cada um já com seu Endereco).
    private ArrayList<Pessoa> funcionarios;

    /*
     * Construtor da Empresa.
     * Inicializa o nome e cria a lista vazia de funcionários
     * (new ArrayList<>() aloca a estrutura na memória).
     */
    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    /*
     * Adiciona um funcionário à empresa.
     * Para reforçar a composição, a Empresa cria o Endereco e a Pessoa
     * internamente e adiciona a Pessoa na lista.
     * Retornar a Pessoa adicionada é útil caso quem chamou queira usá-la.
     */
    public Pessoa adicionarFuncionario(String nomePessoa, String rua, int numero, String cidade) {
        // A Empresa cria o endereço (composição).
        Endereco end = new Endereco(rua, numero, cidade);
        // Em seguida, cria a Pessoa já associada a esse endereço.
        Pessoa p = new Pessoa(nomePessoa, end);
        // Guarda a Pessoa na lista interna da Empresa.
        funcionarios.add(p);
        return p;
    }

    public String getNome() {
        return nome;
    }

    /*
     * Retorna a lista de funcionários (somente leitura para quem recebe).
     * Para expor a lista sem permitir que outros a modifiquem direto,
     * usamos uma "view" imutável via Collections.unmodifiableList.
     * Aqui, simplificamos retornando a própria lista, pois o foco
     * é didático.
     */
    public ArrayList<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    /*
     * Exibe no console o nome da empresa e a lista de funcionários
     * com seus endereços completos.
     * O 'for-each' percorre cada Pessoa da lista de forma simples.
     */
    public void exibirFuncionarios() {
        System.out.println("Empresa: " + nome);
        System.out.println("Funcionários:");
        for (Pessoa p : funcionarios) {
            System.out.println("- " + p.dadosCompletos());
        }
    }
}
