package facil.exercicio01.test;

import facil.exercicio01.dominio.Pessoa;

public class Exercicio01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Pedro";
        p1.idade = 18;

        System.out.println(p1.nome + " " + p1.idade);

    }
}
