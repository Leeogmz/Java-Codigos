<<<<<<< HEAD
public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcos Santana");
        g1.setCpf("065.545.545-33");
        g1.setSalario(6000.00);
        //g1.salario = 5000.00;

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        g1.setSenha(5522);
        

       boolean autenticou = g1.autentica(5522);
       System.out.println(autenticou);

       System.out.println(g1.getBonificacao());
              
    }


    
}
=======
public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcos Santana");
        g1.setCpf("065.545.545-33");
        g1.setSalario(6000.00);
        //g1.salario = 5000.00;

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        g1.setSenha(5522);
        

       boolean autenticou = g1.autentica(5522);
       System.out.println(autenticou);

       System.out.println(g1.getBonificacao());
       

       

       


        
    }


    
}
>>>>>>> 3536c002e83c3699d97fb491126dcd15e28393a0
