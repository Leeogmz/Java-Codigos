public class Administrador extends Funcionario implements Autenticavel {   

    private Autenticador login;

    public Administrador(){
        this.login = new Autenticador();
    }

    @Override
    public void setSenha(int senha){
        this.login.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.login.autentica(senha);        
    } 
    
    @Override
    public double getBonificacao() {
        return 500;
    }
}
