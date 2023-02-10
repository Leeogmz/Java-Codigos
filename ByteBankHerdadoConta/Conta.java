public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    
    public Conta (int agencia, int numero) {
      Conta.total++;
      System.out.println("O total de contas é: " + Conta.total );
      this.agencia = agencia;
      this.numero = numero;
      System.out.println("Nova Conta criada:");
      System.out.println();
      System.out.println("Numero da agencia: " + this.agencia + " Numero da conta: " + this.numero);
      

    }

    

    public void deposita( double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso, você depositou " + valor);

    } 

    public boolean saca (double valor) {
      if(this.saldo >= valor ) {
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso, seu saldo é " + this.saldo);
        return true ;

      } else {
        System.out.println("Você não possui saldo suficiente, seu saldo é: " + this.saldo);
        return false;
      }
      
     }

public boolean transfere (double valor,Conta destino){

    if(this.saca(valor)) {
        destino.deposita(valor);
        System.out.println("Você acabou de transferir: " + valor);
        return true;

    } else {
      System.out.println("Você não possui saldo suficiente, seu saldo é: " + this.saldo);
        return false;
    }
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
 
}

