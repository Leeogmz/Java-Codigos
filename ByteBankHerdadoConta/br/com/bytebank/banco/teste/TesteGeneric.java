package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteGeneric {
	
	public static void main(String[] args) {
		
	

    GuardadorDeReferencias guardador = new GuardadorDeReferencias();
    ContaCorrente cc = new ContaCorrente(15, 16);

    guardador.adiciona(cc);




    ContaCorrente cc2 = new ContaCorrente(22, 21);

    guardador.adiciona(cc2);

    int tamanho = guardador.getQuantidadeDeElementos();

    System.out.println(tamanho);

    ContaCorrente ref = (ContaCorrente) guardador.getReferencia(1);
    System.out.println(ref.getNumero());



}

}