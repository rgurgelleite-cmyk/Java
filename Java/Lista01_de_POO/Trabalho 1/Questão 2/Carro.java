// Classe Carro: representa um carro que TEM um motor (composição forte).
// Composição forte = o objeto Motor é criado DENTRO do Carro e vive junto com ele.
// Quando o Carro deixa de existir, seu Motor também deixa.
public class Carro {
    // Atributo primitivo: guarda o modelo (texto).
    String modelo;
    // Atributo do tipo Motor: cada Carro possui UM Motor.
    // Isso é a "composição": um objeto contém outro como parte de si.
    Motor motor;

    // Construtor do Carro: recebe o modelo e a potencia do motor.
    public Carro(String modelo, int potenciaDoMotor) {
        this.modelo = modelo;
        // Aqui está a COMPOSIÇÃO FORTE: o Motor é instanciado dentro do Carro.
        // Não recebemos um Motor "de fora"; criamos um novo com `new`.
        this.motor = new Motor(potenciaDoMotor);
    }
}
