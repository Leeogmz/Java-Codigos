package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {
      
        ContaCorrente[] contas = new ContaCorrente[5];


        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente (123,321);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

    }

}