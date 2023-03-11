package br.com.bytebank.banco.teste.Util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList<>();

        
        Conta cc1 = new ContaCorrente(22, 11);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente (123,321);
        lista.add(cc2);



        System.out.println("Tamanho " + lista.size());

        Conta ref = (Conta) lista.get(0);

        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho " + lista.size());


        Conta cc3 = new ContaCorrente(22, 11);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22, 11);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);

        }

        System.out.println("---------------");


        
        for(Object oRef : lista) {

            System.out.println(oRef);


        }


        
    }
}
