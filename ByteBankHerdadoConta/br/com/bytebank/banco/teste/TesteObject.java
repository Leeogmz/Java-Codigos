package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("x");
	     System.out.println(3);
	     System.out.println(false);

	     Object cc = new ContaCorrente(22, 33);
	     Object cp = new ContaPoupanca(33, 22);
	     Object clien = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);

		
		println(cc);
		println(cp);
	    println(clien);

		
    
	}
    static void println() {
    }

    static void println(int a) {
    }

    static void println(boolean valor) {
    }
    static void println(Object referencia) {
    }

}


