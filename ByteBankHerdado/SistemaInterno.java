public class SistemaInterno {
    private int senha=2222;


    public void autentica(FuncionarioAutenticavel fa){
       boolean autenticou = fa.autentica(2222);
       if(autenticou){

       System.out.println("Pode entrar no sistema");
       
    } else {
        System.out.println("Senha incorreta!");
    }

    }
        
 
}
