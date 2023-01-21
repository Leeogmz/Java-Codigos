public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta(); 
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println("Novo saldo da conta " + contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);
    


        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        
        if(contaDaMarcela.transfere(300, contaDoPaulo)){
            System.out.println("Transferencia realizada com sucesso ");
            System.out.print("");
            System.out.println( "Saldo restante " + contaDaMarcela.saldo);
        } else { System.out.println("Saldo insuficiente, ");
                 System.out.print("");
                 System.out.println("o valor disponivel para transferencia é de: " + contaDaMarcela.saldo);
        }
        //System.out.println("Novo saldo da conta da Marcela " + contaDoPaulo.saldo);
        //System.out.println("Novo saldo da conta do Paulo " + contaDaMarcela.saldo);


    }

    
}
