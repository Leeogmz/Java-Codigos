
public class TesteSacaException {
    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente(123,321); 
            cc.deposita(200);
            cc.saca(200);


            System.out.println(cc.getSaldo());

        
    }
}
