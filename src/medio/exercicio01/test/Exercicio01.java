package medio.exercicio01.test;

import medio.exercicio01.dominio.Gerente;

public class Exercicio01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Roberto", 1000);

        System.out.println(gerente.getSalario());
        gerente.calcularBonus();
        System.out.println(gerente.getSalario());

    }
}
