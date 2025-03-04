package medio.exercicio02.test;

import medio.exercicio02.dominio.Animal;
import medio.exercicio02.dominio.Cachorro;
import medio.exercicio02.dominio.Gato;

public class Exercicio02 {
    public static void main(String[] args) {
        Animal aurora = new Cachorro();
        Animal rex = new Gato();

        aurora.emitirSom();
        rex.emitirSom();

    }
}
