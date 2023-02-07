public class TestaValores {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1337, 24226);            
        Conta conta2 = new Conta(2020, 31051);
        Conta conta3 = new Conta(2023, 40550);
        System.out.println(Conta.getTotalDeContas());
        System.out.println(conta2.getAgencia());
        
    }
}
