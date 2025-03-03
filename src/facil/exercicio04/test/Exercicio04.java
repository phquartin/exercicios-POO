package facil.exercicio04.test;

import facil.exercicio04.dominio.Calculadora;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        double n1, n2;

        System.out.println("Digite dois numeros abaixo");

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        System.out.println(calc.somar(n1, n2));
        System.out.println(calc.subtrair(n1, n2));
        System.out.println(calc.multiplicar(n1, n2));
        System.out.println(calc.dividir(n1, n2));

    }
}
