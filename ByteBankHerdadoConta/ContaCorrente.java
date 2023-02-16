public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

    public ContaCorrente(int agencia, int numero){

        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorSaque = valor + 0.2;
        return super.saca(valorSaque);
    }
    
}