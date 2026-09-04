/*
 * Classe principal (Main).
 * Toda aplicação Java começa por um método 'main' com esta assinatura exata:
 *   public static void main(String[] args)
 *
 * - 'public': acessível por qualquer parte do programa.
 * - 'static': pode ser executado sem criar um objeto da classe.
 * - 'void': não retorna nada.
 * - 'String[] args': argumentos passados pela linha de comando (não usamos aqui).
 *
 * Aqui criamos uma Empresa e adicionamos funcionários a ela, demonstrando
 * a relação de composição descrita no enunciado.
 */
public class Main {

    public static void main(String[] args) {

        // Cria a empresa (chama o construtor Empresa(String)).
        Empresa empresa = new Empresa("Tech Solutions");

        // Adiciona funcionários. A Empresa cria, internamente,
        // um Endereco e uma Pessoa para cada chamada.
        empresa.adicionarFuncionario("Ana Silva",   "Rua das Flores",  120, "São Paulo");
        empresa.adicionarFuncionario("Bruno Costa", "Av. Brasil",     985, "Rio de Janeiro");
        empresa.adicionarFuncionario("Carla Dias",  "Rua dos Pinhais", 45, "Curitiba");

        // Exibe a lista de funcionários com seus endereços completos.
        empresa.exibirFuncionarios();
    }
}
