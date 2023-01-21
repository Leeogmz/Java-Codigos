public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    //Maneira de depositar dinheiro em uma conta

    public void deposita( double valor) {
        this.saldo = this.saldo + valor;

    } 
}
