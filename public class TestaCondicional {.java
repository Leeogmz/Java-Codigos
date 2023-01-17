public class TestaCondicional {

	public static void main(String[] args) {

		int idade = 16;
		int quantidadePessoas = 4;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println ("Seja bem vindo");
			

		} 
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar pois está acompanhado");
			} else {
			System.out.println("Infelizmente você não pode entrar");
			}
		} 

	}

}