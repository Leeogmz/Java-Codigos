package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {
      
        Conta[] referencias = new Conta[5];


        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cp2 = new ContaPoupanca (123,321);
        referencias[1] = cp2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
        System.out.println(cp2.getNumero());
        System.out.println(ref.getNumero());


    }

}