package facil.exercicio02.dominio;

public class ContaBancaria {
    private double saldo;

    public void Depositar(double valor){
        this.saldo += valor;
    }
    public void Sacar(double valor){
        this.saldo -= valor;
    }
    public void VerSaldo(){
        System.out.println(this.saldo);
    }

}
