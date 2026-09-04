// Classe principal (main). Todo programa Java precisa de um método `main`
// para ser executado: `public static void main(String[] args)`.
public class Main {
    public static void main(String[] args) {
        // Criando um Carro. `new` chama o construtor da classe Carro,
        // que por sua vez cria um Motor internamente.
        Carro meuCarro = new Carro("Fusca", 1200);

        // Acessando atributos com o ponto (`.`): objeto.atributo.
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Potencia do motor: " + meuCarro.motor.potencia + " cv");
    }
}
