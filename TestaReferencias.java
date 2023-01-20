public class TestaReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeira: " + primeiraConta.saldo);
    
    Conta segundaConta = primeiraConta;
    System.out.println("Saldo da segunda: " + segundaConta.saldo);

    segundaConta.saldo+=100;

    System.out.println("Saldo da segunda: " + segundaConta.saldo);

     System.out.println("Saldo da primeira conta " + primeiraConta.saldo);

if(primeiraConta == segundaConta) {

    System.out.println("São a mesma conta");
} else {
   System.out.println("São contas diferentes");

}

System.out.println(primeiraConta);
System.out.println(segundaConta);

    }
}
