package facil.exercicio02.test;

import facil.exercicio02.dominio.ContaBancaria;

public class Exercicio02 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.Depositar(1000);
        conta.VerSaldo();
        conta.Sacar(100);
        conta.VerSaldo();
    }
}
