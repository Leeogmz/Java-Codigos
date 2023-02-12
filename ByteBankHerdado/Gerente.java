public class  Gerente extends Funcionario implements Autenticavel {
    
    private Autenticador login;

    public Gerente(){
        this.login = new Autenticador();
    }



    @Override
    public void setSenha(int senha) {
        this.login.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.login.autentica(senha);
    }
    
    public double getBonificacao(){
       return super.getSalario();
    }
}
    
