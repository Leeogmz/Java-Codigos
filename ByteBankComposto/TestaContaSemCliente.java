package ByteBankComposto;

public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.saldo);

       contaDaMarcela.titular = new Cliente();
       System.out.println(contaDaMarcela.titular);

       contaDaMarcela.titular.nome = "Marcela";
       contaDaMarcela.titular.cpf = "222.555.555-55";
       contaDaMarcela.titular.profissao = "Desenvolvedora";

       System.out.println(contaDaMarcela.titular.nome);

    }
    
}
