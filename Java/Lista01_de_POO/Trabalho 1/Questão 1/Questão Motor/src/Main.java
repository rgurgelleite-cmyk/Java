/**
 * A classe 'Main' é onde o programa realmente começa a ser executado.
 */
public class Main {
    /**
     * O método 'main' é o ponto de entrada de qualquer aplicação Java.
     * 'String[] args' permite que o programa receba argumentos via linha de comando.
     */
    public static void main(String[] args) {
        // 1. Criando um objeto da classe Autor.
        // Usamos a palavra 'new' para instanciar (criar) um objeto na memória.
        Autor meuAutor = new Autor("J.K. Rowling", "Britânica");
        
        // 2. Criando um objeto da classe Livro.
        // Passamos o objeto 'meuAutor' como um dos parâmetros do construtor de Livro.
        Livro meuLivro = new Livro("Harry Potter e a Pedra Filosofal", 1997, meuAutor);
        
        // 3. Exibindo os dados no console.
        // 'System.out.println' é o comando para imprimir texto e pular linha.
        System.out.println("--- Dados do Livro ---");
        System.out.println("Título: " + meuLivro.titulo);
        System.out.println("Ano de Publicação: " + meuLivro.anoPublicacao);
        
        // Para acessar o nome do autor, navegamos através do objeto Livro:
        // meuLivro (objeto Livro) -> autor (objeto Autor associado) -> nome (atributo do Autor)
        System.out.println("Autor: " + meuLivro.autor.nome);
        System.out.println("Nacionalidade do Autor: " + meuLivro.autor.nacionalidade);
    }
}

