package medio.exercicio03.test;

import medio.exercicio03.dominio.Carro;
import medio.exercicio03.dominio.Moto;
import medio.exercicio03.dominio.Veiculo;

public class Exercicio03 {
    public static void main(String[] args) {
        Veiculo moto = new Moto();
        Veiculo carro = new Carro();

        moto.acelerar();
        moto.frear();

        carro.acelerar();
        carro.frear();

    }
}
