// Classe Motor: representa o motor de um carro.
// Em POO, uma classe é um "molde" para criar objetos.
// Aqui o motor é simples, com apenas um atributo: potencia (em cavalos, por exemplo).
public class Motor {
    // Atributo (variável da classe). É a informação que cada objeto Motor guarda.
    int potencia;

    // Construtor: método especial chamado ao criar um objeto com `new Motor(...)`.
    // Ele serve para inicializar o objeto com valores já definidos.
    public Motor(int potencia) {
        // `this.potencia` se refere ao atributo da instância (do objeto).
        // O `potencia` sem `this.` é o parâmetro recebido no construtor.
        this.potencia = potencia;
    }
}
