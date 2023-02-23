
public class TesteSacaException {
    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente(123,321); 
            cc.deposita(200);
           try{
            cc.saca(210);
           } catch (Exception ex) {
            System.out.println(ex.getMessage());
           }


            System.out.println(cc.getSaldo());

        
    }
}
