
public class teste {
    
        public static void main(String[] args) {
            Conta conta = new Conta(297, 20055);
            conta.setNumero(1337);
            System.out.println(conta.getNumero());


            Cliente paulo = new Cliente();
            paulo.setNome("Paulo Silveira");
            conta.setTitular(paulo);
            System.out.println(paulo.getNome());

            System.out.println(conta.getTitular().getNome());

            conta.getTitular().setProfissao("Programador");

            System.out.println(conta.getTitular().getProfissao());



        }
    }
