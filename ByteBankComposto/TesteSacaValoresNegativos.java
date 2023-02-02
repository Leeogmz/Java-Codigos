package ByteBankComposto;

public class TesteSacaValoresNegativos {
   public static void main(String[] args) {
    Conta conta = new Conta(); 
    conta.deposita(100);
    conta.saca(200);
    System.out.println(conta.getSaldo());

    //Não queremos deixar que isso aconteça
    //conta.saldo = conta.saldo - 201;
    //System.out.println(conta.saldo);
    



   }
      

}