package br.com.bytebank.banco.modelo;
public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

    public ContaCorrente(int agencia, int numero){

        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorSaque = valor + 0.2;
        super.saca(valorSaque);
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Conta corrente, " + super.toString();
    }
    
}
