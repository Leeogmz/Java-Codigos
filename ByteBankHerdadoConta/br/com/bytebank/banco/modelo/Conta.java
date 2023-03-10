package br.com.bytebank.banco.modelo;


/**
 * Classe representa a moldura de uma conta
 * @author Leonardo Gomes
 * 
 */
public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto conta a partir da agencia e numero
     * @param agencia
     * @param numero
    */
    public Conta (int agencia, int numero) {
      if(agencia < 1) {
        throw new IllegalArgumentException("Agencia inválida");
      }
      if (numero < 1) {
        throw new IllegalArgumentException("Numero da conta inválida");
      }
      Conta.total++;
      System.out.println("O total de contas é: " + Conta.total );
      this.agencia = agencia;
      this.numero = numero;
      
      

    }

    

    public void deposita( double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso, você depositou " + valor);

    } 
/**
 * Valor precisa ser maior do que o saldo.
 * @param valor
 * @throws SaldoInsuficienteException
 */
    public void saca (double valor) throws SaldoInsuficienteException {

      if(this.saldo < valor ) {
        throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
      }

        this.saldo -= valor;
      }
    

public void transfere (double valor,Conta destino) throws SaldoInsuficienteException {
  
  this.saca(valor);
  destino.deposita(valor);
        
}

 public double getSaldo() {
  return this.saldo;
  }   

  public int getNumero(){
    return this.numero;
  } 
  public void setNumero(int numero){
    if(numero <= 0) {
      System.out.println("Não é permitido incluir valores menores ou iguais a 0 ");
      return;
    }
    this.numero = numero;
  }

  public int getAgencia(){
    return this.agencia;
  }
  public void setAgencia(int agencia){
    if(agencia <= 0) { 
      System.out.println("Não é permitido incluir valores menores ou iguais a 0 ");
    return;

    }
    this.agencia = agencia;
  }

  public Cliente getTitular() {
      return titular;
  }

  public void setTitular(Cliente titular) {
      this.titular = titular;
  }
  public static int getTotalDeContas(){
    return Conta.total;
  }
  
  @Override
public String toString() {
	// TODO Auto-generated method stub
	return "Numero: "  +this.getNumero() + " Agencia: " + this.getAgencia();
}
 
}

