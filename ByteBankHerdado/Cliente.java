public class Cliente implements Autenticavel {
    private Autenticador login;

    public Cliente(){
        this.login = new Autenticador();
    }

    public void setSenha(int senha) {
        this.login.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.login.autentica(senha);
    }
}
