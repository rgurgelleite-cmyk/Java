/**
 * CLASSE PRINCIPAL (App)
 * 
 * Ponto de entrada do programa. Aqui criamos o objeto 'Livro' e preenchemos
 * seus valores diretamente (sem utilizar construtores ou getters/setters).
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      SISTEMA DE GERENCIAMENTO DE BIBLIOTECA      ");
        System.out.println("==================================================\n");

        // 1. CRIANDO O OBJETO
        // Instanciamos o objeto usando 'new Livro()' (construtor padrão do Java)
        System.out.println("1. Criando um novo livro e preenchendo os dados diretamente...");
        Livro meuLivro = new Livro();

        // Atribuindo valores diretamente às variáveis do livro (sem métodos construtores)
        meuLivro.titulo = "Dom Casmurro";
        meuLivro.autor = "Machado de Assis";
        meuLivro.isbn = "978-8535902778";
        meuLivro.anoPublicacao = 1899;
        meuLivro.quantidadeDisponivel = 2; // Começamos com 2 exemplares em estoque

        // Exibindo os dados iniciais
        meuLivro.exibirInformacoes();

        // 2. TESTANDO O EMPRÉSTIMO
        System.out.println("\n2. Realizando empréstimos...");
        
        // Primeiro empréstimo (Estoque cai para 1)
        meuLivro.emprestar();
        
        // Segundo empréstimo (Estoque cai para 0)
        meuLivro.emprestar();
        
        // Terceiro empréstimo (Tentativa com estoque 0 -> Deve alertar falta de estoque)
        meuLivro.emprestar();

        // Mostra o status do livro no momento
        meuLivro.exibirInformacoes();

        // 3. TESTANDO A DEVOLUÇÃO
        System.out.println("\n3. Devolvendo um exemplar do livro...");
        meuLivro.devolver(); // Estoque sobe para 1

        // 4. TESTANDO EMPRÉSTIMO NOVAMENTE APÓS A DEVOLUÇÃO
        System.out.println("\n4. Tentando emprestar novamente...");
        meuLivro.emprestar(); // Estoque cai para 0

        // Estado final do livro
        System.out.println("\n5. Estado final do livro:");
        meuLivro.exibirInformacoes();
    }
}
