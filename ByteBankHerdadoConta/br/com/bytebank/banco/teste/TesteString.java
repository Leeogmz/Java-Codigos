package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//método para anular todos os espaços em uma String.
		String vazio ="    Alura    ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio);
		System.out.println(outroVazio);
		
		
		
		
		int a = 3;
		String nome = "Alura"; //objeto literal
		//String outro = new String("Alura");
		
        // para saber qual é o caractere que ocupa uma posição específica
		char c = nome.charAt(2);
		System.out.println(c);
		
		
		//perguntar qual é a posição dessa String dentro de "Alura"
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		//criação de uma sub-String
		String sub = nome.substring(1);
		System.out.println(sub);
		
		//saber qual é o tamanho de uma determinada String
		System.out.println(nome.length());
		
		
		
		
		System.out.println(nome);

	}

}
