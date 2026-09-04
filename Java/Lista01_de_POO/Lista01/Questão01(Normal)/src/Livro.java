/**
 * CLASSE LIVRO (VERSÃO SIMPLIFICADA)
 * 
 * Uma "Classe" em Java é como uma ficha ou modelo que define as informações (atributos)
 * e as ações (métodos) de algo do mundo real — neste caso, um Livro.
 * 
 * Nota para iniciantes: Nesta versão simples, NÃO estamos utilizando Encapsulamento
 * (modificadores privados) nem Métodos Construtores personalizados.
 */
public class Livro {

    // =========================================================================
    // ATRIBUTOS (CARACTERÍSTICAS DO LIVRO)
    // =========================================================================
    // Como estamos mantendo o código no nível básico, os atributos são 'public',
    // o que significa que podem ser acessados e preenchidos diretamente.

    public String titulo;               // Título do livro (Texto)
    public String autor;                // Autor do livro (Texto)
    public String isbn;                 // Código identificador único (Texto)
    public int anoPublicacao;           // Ano em que foi lançado (Número inteiro)
    public int quantidadeDisponivel;    // Quantidade de cópias no estoque (Número inteiro)

    // =========================================================================
    // MÉTODOS (AÇÕES QUE O LIVRO PODE REALIZAR)
    // =========================================================================

    /**
     * Método para registrar quando um livro é emprestado.
     * Reduz a quantidade disponível em 1 exemplar (se houver estoque).
     */
    public void emprestar() {
        // Verifica se há pelo menos 1 exemplar disponível
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel = quantidadeDisponivel - 1; // Reduz o estoque
            System.out.println("[SUCESSO] Empréstimo realizado do livro: " + titulo);
            System.out.println("          Exemplares restantes: " + quantidadeDisponivel);
        } else {
            System.out.println("[ALERTA] Não foi possível emprestar '" + titulo + "'. Estoque esgotado!");
        }
    }

    /**
     * Método para registrar quando um livro é devolvido.
     * Aumenta a quantidade disponível em 1 exemplar.
     */
    public void devolver() {
        quantidadeDisponivel = quantidadeDisponivel + 1; // Aumenta o estoque
        System.out.println("[DEVOLUÇÃO] Livro devolvido com sucesso: " + titulo);
        System.out.println("            Nova quantidade disponível: " + quantidadeDisponivel);
    }

    /**
     * Método simples para exibir todos os dados do livro na tela.
     */
    public void exibirInformacoes() {
        System.out.println("--------------------------------------------------");
        System.out.println(" Informações do Livro:");
        System.out.println("   - Título: " + titulo);
        System.out.println("   - Autor: " + autor);
        System.out.println("   - ISBN: " + isbn);
        System.out.println("   - Ano de Publicação: " + anoPublicacao);
        System.out.println("   - Quantidade Disponível: " + quantidadeDisponivel);
        System.out.println("--------------------------------------------------");
    }
}
