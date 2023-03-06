package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {
	
	

	public static void main(String[] args) {



        int[] idades = new int[5];//já inicializa o array com os valores padrões = 0
        
        for (int i = 0; i < idades.length; i++){

            idades[i] = i * i;

        }


        
        for (int i = 0; i < idades.length; i++){

            System.out.println(idades[i]);
        }





    }
    
}
